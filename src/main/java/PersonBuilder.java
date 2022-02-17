public class PersonBuilder {
    protected String name;
    protected String surname;
    protected String city;
    protected String address;
    protected int age;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }
    public PersonBuilder setAddress(String address){
        this.address = address;
        return this;
    }

    public Person build() {
        return new Person(name,  surname, age, city, address);
    }
}
