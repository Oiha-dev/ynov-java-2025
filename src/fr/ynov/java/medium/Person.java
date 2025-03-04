package fr.ynov.java.medium;

public class Person {

    public static void main(String[] args) {
        Person person = new Person("John", 30, "Male", 1.80f, 80.0f, Country.USA);
        PrintPerson(person);
    }

    public enum Country {
        FRANCE, USA, CANADA, UK, GERMANY
    }

    public String name;
    public int age;
    public String gender;
    public float height;
    public float weight;
    public Country nationality;

    public Person(String name, int age, String gender, float height, float weight, Country nationality) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    public static void PrintPerson(Person person) {
        System.out.println(person.name + " is a " + person.age + " year old " + person.gender.toLowerCase() +
                " from " + person.nationality + ". They are " + person.height + "m tall and weigh " + person.weight + "kg.");
    }

}
