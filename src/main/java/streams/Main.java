package streams;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

/**
 * Mainmetod för Streams
 */
public class Main {

    /**
     *
     * @param people is a list of {@link Person} generated from a JSON-file
     *
     */

    public static void stepTwoFor(List<Person> people) {
        for (Person person : people) {
            if (person.getAge() > 10) {
                System.out.println(person.getName() + " är äldre än 10");
            }
        }
    }

    /**
     *
     * Explaining how to print out people addresses using a for loop instead of a stream
     *
     * @param people is a list of {@link Person} generated from a JSON-file
     */
    private static void stepThreeFor(List<Person> people) {
        for(Person person : people) {
            if (person.getAge() > 10 && person.getAge() < 45) {
                if(person.getName() != null) {
                    if(person.getName().startsWith("L")) {
                        System.out.println(person.getAdress());
                    }
                }
            }
        }
    }

    /**
     *
     * @param people
     */
    private static void stepFourFor(List<Person> people) {
        for(Person person : people) {
            if (person.getAge() > 30) {
                if(person.getName() != null && person.getAdress() != null) {
                    if(person.getFavouriteCandy().contains("s")) {
                        System.out.println(person.getFavouriteCandy());
                    }
                }
            }
        }
    }
    private static void stepFourStream(List<Person> people) {
        people.stream()
                .filter(person -> person.getAge() > 30)
                .filter(person -> person.getName() != null && person.getAdress() != null)
                .filter(person -> person.getFavouriteCandy().contains("s"))
                .map(person -> person.getFavouriteCandy())
                .forEach(System.out::println);
    }

    private static void stepThreeStream(List<Person> people) {
        people.stream()
                .filter(person -> person.getAge() > 10 && person.getAge() < 45)
                .filter(person -> person.getName() != null)
                .filter(person -> person.getName().startsWith("L"))
                .map(person -> person.getAdress())
                .forEach(System.out::println);
    }

    private static void stepTwoStream(List<Person> people) {
        people.stream()
                .filter(person -> person.getAge() > 10)
                .forEach(person -> System.out.println(person.getName() + " är äldre än 10"));
    }

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Person> people = List.of(mapper.readValue(Paths.get("src/main/java/streams/people.json").toFile(), Person[].class));

        //stepTwoFor(people);
        System.out.println("----------------");
        //stepTwoStream(people);
        System.out.println("---------------");
        //stepThreeFor(people);
        //stepThreeStream(people);

        stepFourFor(people);
        stepFourStream(people);

    }
}
