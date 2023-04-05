import com.google.protobuf.ByteString;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

import io.grpc.stub.StreamObserver;
import org.example.model.*;

public class GrpcServer {
    private static ArrayList<Person> People;
    private static String folderFilePath = "F:\\Marta\\Studia\\Semestr_VI\\RSI\\L\\1\\Server\\";

    public static void main(String[] args) {
        int port = 50001;
        System.out.println("Starting gRPC server...");
        People = new ArrayList<Person>();
        People.add(new Person("1111","Monika", "Pracz", 21, "osoba1.jpg"));
        People.add(new Person("2222","Karol", "Gor", 43, "osoba2.jpg"));
        People.add(new Person("3333","Weronika", "Fiołek", 27, "osoba3.jpg"));
        Server server = ServerBuilder.forPort(port)
                .addService(new MyServiceImpl()).build();
        try {
            server.start();
            System.out.println("...Server started");
            server.awaitTermination();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    static class MyServiceImpl extends ServiceNameGrpc.ServiceNameImplBase {
        public void unaryProcedure(TheRequest req, StreamObserver<TheResponse> responseObserver) {
            String msg;
            System.out.println("...called UnaryProcedure - start");
            if (req.getAge() > 18)
                msg = "Mr/Ms " + req.getName();
            else
                msg = "Boy/Girl";
            TheResponse response = TheResponse.newBuilder()
                    .setMessage("Hello " + msg)
                    .build();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            System.out.println("...called UnaryProcedure - end");
        }

        public void streamProcedure(TheRequest req, StreamObserver<TheResponse> responseObserver) {
            for (int i = 0; i < 6; i++) {
                TheResponse response = TheResponse.newBuilder()
                        .setMessage("Stream chunk " + (i + 1)).build();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                responseObserver.onNext(response);
            }
            responseObserver.onCompleted();
        }

        public void fib(TheRequest req, StreamObserver<TheResponse> responseObserver) {
            int a = 1, b = 1;
            for (int i = 0; i < req.getAge(); i++) {
                if (i > 1) {
                    int tmp = a + b;
                    a = b;
                    b = tmp;
                }
                TheResponse response;
                if (req.getName().equals("fib")) {
                    response = TheResponse.newBuilder()
                            .setMessage("Fib " + (b)).build();
                } else {
                    response = TheResponse.newBuilder()
                            .setMessage("FibK " + (b * b)).build();
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                responseObserver.onNext(response);
            }
            responseObserver.onCompleted();
        }

        public void putData(TheRequest req, StreamObserver<TheResponse> responseObserver) {
            String msg = "";

            Person newPerson = new Person(req.getPesel(), req.getName(), req.getSurname(), req.getAge(), req.getPhotoName());
            People.add(newPerson);

            msg = "New person added";

            TheResponse response = TheResponse.newBuilder()
                    .setMessage(msg)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        public void getPeople(TheRequest req, StreamObserver<TheResponse> responseObserver) {
            for (int i = 0; i < People.size(); i++) {
                TheResponse response = TheResponse.newBuilder()
                        .setMessage(i + ": " + People.get(i).getSurname())
                        .build();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                responseObserver.onNext(response);
            }
            responseObserver.onCompleted();
        }

        public void getPerson(TheRequest req, StreamObserver<TheResponse> responseObserver) {
            boolean found = false;
            int i = 0;
            String msg = "";
            while (!found && i < People.size()) {

                if (Objects.equals(People.get(i).getPesel(), req.getPesel())) {
                    found = true;
                    msg = People.get(i).toString();
                }
                i++;
            }
            if (!found) {
                msg = "Brak osoby o podanym peselu";
            }

            TheResponse response = TheResponse.newBuilder()
                    .setMessage(msg)
                    .build();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            responseObserver.onNext(response);
            responseObserver.onCompleted();

        }

        public void getPhoto(ByteRequest req, StreamObserver<ByteResponse> responseObserver) {
            int BUF_SIZE = 4096;

            String fileName = req.getName();
            System.out.println("Received request for file: " + fileName);
            InputStream instr = null;
            try {
                instr = new FileInputStream((folderFilePath + fileName));
                byte[] buffer = new byte[BUF_SIZE];
                int size;
                while((size = instr.read(buffer)) > 0) {
                    responseObserver.onNext(ByteResponse.newBuilder()
                            .setChunk(ByteString.copyFrom(buffer, 0, size))
                            .build());
                    Thread.sleep(500);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("File sent!");
            responseObserver.onCompleted();
        }

        @Override
        public StreamObserver<FileUploadRequest> putPhoto(StreamObserver<FileUploadResponse> responseObserver) {
            return new StreamObserver<>() {
                FileOutputStream output;

                @Override
                public void onNext(FileUploadRequest fileUploadRequest) {
                    try{
                        if(fileUploadRequest.hasMetadata()){
                            output = getFilePath(fileUploadRequest);
                        }else{
                            writeFile(output, fileUploadRequest.getFile().getContent());
                        }
                    }catch (IOException e){
                        this.onError(e);
                    }
                }

                @Override
                public void onError(Throwable throwable) {
                    this.onCompleted();
                }

                @Override
                public void onCompleted() {
                    closeFile(output);
                    FileUploadResponse response = FileUploadResponse.newBuilder()
                            .build();
                    responseObserver.onNext(response);
                    responseObserver.onCompleted();
                }

                    private FileOutputStream getFilePath(FileUploadRequest request) throws IOException {
                        var fileName = folderFilePath + request.getMetadata().getName() + "." + request.getMetadata().getType();
                        return new FileOutputStream(fileName);
                    }

                    private void writeFile(FileOutputStream output, ByteString content) throws IOException {
                        output.write(content.toByteArray());
                        output.flush();
                    }

                    private void closeFile(OutputStream writer){
                        try {
                            writer.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
            };

        }

        public void deletePerson(TheRequest req, StreamObserver<TheResponse> responseObserver) {
            boolean found = false;
            int i = 0;
            String msg = "";
            while (!found && i < People.size()) {
                if (Objects.equals(People.get(i).getPesel(), req.getPesel())) {
                    found = true;
                    People.remove(i);
                    msg = "Osoba o podanym peselu została usunięta";
                }
                i++;
            }
            if (!found) {
                msg = "Brak osoby o podanym peselu";
            }

            TheResponse response = TheResponse.newBuilder()
                    .setMessage(msg)
                    .build();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}

