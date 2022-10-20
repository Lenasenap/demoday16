package recordsandclasses;

public class Main {
    public static void main(String[] args) {
        PersonClass lenaClass = new PersonClass("Lena", 33, "Dr. Strange");
        PersonClass lenaClass2 = new PersonClass("Lena", 33, "Dr. Strange");
        PersonClass jyriClass = new PersonClass("Jyri", 37, "Alla Marvel");

        PersonClass glennClass = new PersonClass(45, "Glenn the Movie");
        System.out.println(PersonClass.getNumberOfPeople());

        PersonRecord lenaRecord = new PersonRecord("Lena", 33, "Dr. Strange");
        PersonRecord glennRecord = new PersonRecord(45, "Glenn the Movie");

        System.out.println(lenaClass);
        System.out.println(lenaRecord);

        System.out.println(lenaClass.hashCode());
        System.out.println(lenaClass2.hashCode());
        System.out.println(jyriClass.hashCode());

        System.out.println(lenaRecord.hashCode());
    }
}
