package recordsandclasses;

import java.util.Objects;

public class PersonClass {
    private static int NUMBER_OF_PEOPLE;
    private final String name;
    private final int age;
    private final String favouriteMovie;

    public PersonClass(String name, int age, String favouriteMovie) {
        this.name = name;
        this.age = age;
        this.favouriteMovie = favouriteMovie;
        NUMBER_OF_PEOPLE++;
    }

    public PersonClass(int age, String favouriteMovie) {
        this.name = "Glenn";
        this.age = age;
        this.favouriteMovie = favouriteMovie;
        NUMBER_OF_PEOPLE++;
    }

    public static int getNumberOfPeople() {
        return NUMBER_OF_PEOPLE;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFavouriteMovie() {
        return favouriteMovie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonClass that = (PersonClass) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(favouriteMovie, that.favouriteMovie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, favouriteMovie);
    }

    @Override
    public String toString() {
        return "PersonClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", favouriteMovie='" + favouriteMovie + '\'' +
                '}';
    }
}
