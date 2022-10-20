package streams;

public class Person {
    private String name;
    private String adress;
    private String favouriteCandy;
    private int age;

    public Person(String name, String adress, String favouriteCandy, int age) {
        this.name = name;
        this.adress = adress;
        this.favouriteCandy = favouriteCandy;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getFavouriteCandy() {
        return favouriteCandy;
    }

    public void setFavouriteCandy(String favouriteCandy) {
        this.favouriteCandy = favouriteCandy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
