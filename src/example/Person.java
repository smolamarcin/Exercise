package example;

import java.util.List;
import java.util.Objects;

public class Person {
    private String name;
    private Surname surname;
    private List<Surname> surnamesList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(surnamesList, person.surnamesList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, surnamesList);
    }
}
