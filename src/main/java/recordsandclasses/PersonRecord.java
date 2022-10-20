package recordsandclasses;

public record PersonRecord(String name, int age, String favouriteMovie) {
    //private static int NUMBER_OF_PEOPLE;

    public PersonRecord(int age, String favouriteMovie) {
        this("Glenn",age, favouriteMovie);
        //NUMBER_OF_PEOPLE++;
    }

    /*public PersonRecord(String name, int age, String favouriteMovie) {
        this(name, age, favouriteMovie);
        NUMBER_OF_PEOPLE++;
    }*/

    /*public static int getNumberOfPeople() {
        return NUMBER_OF_PEOPLE;
    }*/
}
