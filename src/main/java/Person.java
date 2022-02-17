import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected String city;
    protected int age;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public Person(String name, String surname, int age, String city, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
        this.address = address;
    }

    public boolean hasAge() {
        return age > 0;
    }


    public boolean hasAddress() {
        return address != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        hasAge();
        return OptionalInt.of(age);
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        hasAddress();
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        hasAge();
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setName(name);
    }

    @Override
    public String toString() {
        return name + " " + surname + "\n" +
                age + " years old\n" +
                "City: " + city + "\n" +
                "Address: " + address + "\n";
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getCity(), getAge(), getAddress());
    }
}