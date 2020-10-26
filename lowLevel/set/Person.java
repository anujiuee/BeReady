package set;

import java.util.Objects;

public class Person {
    private String name;
    private String email;
    private String number;

    public Person(String name, String email, String number) {
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) ||
                Objects.equals(email, person.email) ||
                Objects.equals(number, person.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, number);
    }
}
