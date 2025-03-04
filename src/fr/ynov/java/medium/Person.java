package fr.ynov.java.medium;

import java.util.Date;

public class Person {

    public static void main(String[] args) {
        Person person = new Person("John", new Date(90, 1, 1), "Male", 1.80f, 80.0f, Country.USA);
        PrintPerson(person);
    }

    public enum Country {
        FRANCE, USA, CANADA, UK, GERMANY
    }

    public String name;
    public Date birthDate;
    public String gender;
    public float height;
    public float weight;
    public Country nationality;

    public Person(String name, Date birthDate, String gender, float height, float weight, Country nationality) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    public static void PrintPerson(Person person) {
        System.out.println(person.name + " is a " + birthToAge(person.birthDate) + " year old " + person.gender.toLowerCase() +
                " from " + person.nationality + ". They are " + person.height + "m tall and weigh " + person.weight + "kg.");
    }

    public static int birthToAge ( Date birthDate ) {
        Date now = new Date();
        return now.getYear() - birthDate.getYear();
    }
}
