import java.util.Objects;

public class Person {
    private String pesel, name, surname, photoName;
    private int age;

    public Person(String pesel, String name, String surname, int age, String photoName) {
        this.pesel = pesel;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.photoName = photoName;
    }

    public String getPesel()
    {
        return pesel;
    }

    public String getSurname()
    {
        return surname;
    }

    public String toString()
    {
        String result = "Dane osoby:\n";
        result += "Imię i nazwisko: " + name + " " + surname + '\n';
        result += "Wiek: " + age + '\n';
        if(!Objects.equals(photoName, ""))
            result += "Nazwa pliku ze zdjęciem: " + photoName + '\n';
        else
            result += "Brak zdjęcia\n";
        return result;
    }


}
