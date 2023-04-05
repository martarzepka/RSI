import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.example.model.*;
import org.example.model.File;

import java.io.*;
import java.nio.file.Files;
import java.util.Iterator;
import java.util.Scanner;

public class GrpcClient {
    private static String folderFilePath = "F:\\Marta\\Studia\\Semestr_VI\\RSI\\L\\1\\Client\\";

    public static void main(String[] args) throws IOException, InterruptedException {
        String address = "localhost"; //here we use service on the same host
        int port = 50001;
        ServiceNameGrpc.ServiceNameBlockingStub bStub;
        ServiceNameGrpc.ServiceNameStub nonbStub;
        System.out.println("Running gRPC client...");
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(address, port) .usePlaintext().build();
        bStub = ServiceNameGrpc.newBlockingStub(channel);
        nonbStub = ServiceNameGrpc.newStub(channel);

//        TheRequest request = TheRequest.newBuilder().setName("Marta")
//                .setAge(33).build();
//        System.out.println("...calling unaryProcedure");
//        TheResponse response = bStub.unaryProcedure(request);
//        System.out.println("...after calling unaryProcedure");
//        System.out.println("--> Response: " + response);
//
//        Iterator<TheResponse> respIterator;
//        System.out.println("...calling streamProcedure");
//        respIterator = bStub.streamProcedure(request);
//        System.out.println("...after calling streamProcedure");
//        TheResponse strResponse;
//        while(respIterator.hasNext()) {
//            strResponse = respIterator.next();
//            System.out.println("-->" + strResponse.getMessage());
//        }

//        System.out.println("...async calling unaryProcedure");
//        nonbStub.unaryProcedure(request, new UnaryObs());
//        System.out.println("...after async calling unaryProcedure");
//
//        System.out.println("...async calling streamProcedure");
//        nonbStub.streamProcedure(request, new UnaryObs());
//        System.out.println("...after async calling streamProcedure");
//
//        request = TheRequest.newBuilder().setName("fib").setAge(10).build();
//        System.out.println("...async calling fib");
//        nonbStub.fib(request, new UnaryObs());
//        System.out.println("...after async calling fib");
//
//        request = TheRequest.newBuilder().setName("fibK").setAge(10).build();
//        System.out.println("...async calling fib");
//        nonbStub.fib(request, new UnaryObs());
//        System.out.println("...after async calling fib");

//        TheRequest request = TheRequest.newBuilder().setPesel("3333").build();
//
//        nonbStub.getPerson(request, new UnaryObs());
//        nonbStub.deletePerson(request, new UnaryObs());
//        nonbStub.getPeople(request, new UnaryObs());
//
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        request = TheRequest.newBuilder().setPesel("4444").setName("Robert").setSurname("Kot").setAge(25).setPhotoName("").build();
//        nonbStub.putData(request, new UnaryObs());
//
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        nonbStub.getPeople(request, new UnaryObs());

//        ByteRequest byteRequest = ByteRequest.newBuilder().setName("osoba3.jpg").build();
//        nonbStub.getPhoto(byteRequest, new FileDownloadObs(byteRequest.getName()));


        TheRequest request = TheRequest.newBuilder().build();
        ByteRequest byteRequest = ByteRequest.newBuilder().build();
        Scanner scanner = new Scanner(System.in);
        boolean working = true;
        String pesel, filename;;

        while(working)
        {
            System.out.println("""
                    Menu:
                    0 -> close
                    1 -> add person
                    2 -> get person data
                    3 -> get all people data
                    4 -> upload photo
                    5 -> download photo
                    6 -> delete person""");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0 -> working = false;
                case 1 -> {
                    System.out.println("Enter PESEL:");
                    pesel = scanner.nextLine();
                    System.out.println("Enter name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter surname:");
                    String surname = scanner.nextLine();
                    System.out.println("Enter age:");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter photo file name:");
                    filename = scanner.nextLine();
                    request = TheRequest.newBuilder().setPesel(pesel).setName(name).setSurname(surname).setAge(age).setPhotoName(filename).build();
                    nonbStub.putData(request, new UnaryObs());
                }
                case 2 -> {
                    System.out.println("Enter PESEL:");
                    pesel = scanner.nextLine();
                    request = TheRequest.newBuilder().setPesel(pesel).build();
                    nonbStub.getPerson(request, new UnaryObs());
                }
                case 3 -> nonbStub.getPeople(request, new UnaryObs());
                case 4 -> uploadPhoto(channel);
                case 5 -> {
                    System.out.println("Enter file name:");
                    filename = scanner.nextLine();
                    byteRequest = ByteRequest.newBuilder().setName(filename).build();
                    nonbStub.getPhoto(byteRequest, new FileDownloadObs(byteRequest.getName()));
                }
                case 6 -> {
                    System.out.println("Enter PESEL:");
                    pesel = scanner.nextLine();
                    request = TheRequest.newBuilder().setPesel(pesel).build();
                    nonbStub.deletePerson(request, new UnaryObs());
                }
            }

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        channel.shutdown();
    }

    private static class UnaryObs implements StreamObserver<TheResponse> {
        public void onNext(TheResponse theResponse) {
            System.out.println("-->async onNext: " +
                    theResponse.getMessage());
        }
        public void onError(Throwable throwable) {
            System.out.println("-->async onError");
        }
        public void onCompleted() {
            System.out.println("-->async onCompleted");
        }
    }

    private static class FileDownloadObs implements StreamObserver<ByteResponse> {

        private final FileOutputStream output;

        public FileDownloadObs(String fileName) throws IOException, FileNotFoundException {
            this.output = new FileOutputStream(folderFilePath + fileName);
        }

        @Override
        public void onNext(ByteResponse byteResponse) {

            System.out.println("Downloading...");
            try {
                output.write(byteResponse.getChunk().toByteArray());
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        @Override
        public void onError(Throwable throwable) {
            throwable.printStackTrace();
        }

        @Override
        public void onCompleted() {
            System.out.println("File downloaded");
            try {
                output.flush();
                output.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private static class FileUploadObs implements StreamObserver<FileUploadResponse> {

        @Override
        public void onNext(FileUploadResponse fileUploadResponse) {
            System.out.println("Uploading...");
        }

        @Override
        public void onError(Throwable throwable) {
            throwable.printStackTrace();
        }

        @Override
        public void onCompleted() {
            System.out.println("File uploaded");
        }
    }

    public static void uploadPhoto(ManagedChannel channel) throws IOException, InterruptedException {

        ServiceNameGrpc.ServiceNameStub fileServiceStub;
        fileServiceStub = ServiceNameGrpc.newStub(channel);
        var streamObserver = fileServiceStub.putPhoto(new FileUploadObs());
        InputStream instr = new FileInputStream(folderFilePath + "osoba4.jpg");
        byte[] bytes = new byte[4096];
        int size;

        FileUploadRequest metadata =
                FileUploadRequest.newBuilder()
                        .setMetadata(MetaData.newBuilder().setName("osoba4").setType("jpg").build())
                        .build();

        streamObserver.onNext(metadata);

        while ((size = instr.read(bytes)) > 0) {
            FileUploadRequest uploadRequest =
                    FileUploadRequest.newBuilder()
                            .setFile(File.newBuilder().setContent(ByteString.copyFrom(bytes, 0, size)).build())
                            .build();
            streamObserver.onNext(uploadRequest);
        }

        instr.close();
        streamObserver.onCompleted();

    }
}

