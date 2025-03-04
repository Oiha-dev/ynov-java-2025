package fr.ynov.java.medium;

import java.util.Date;

public class Person {

    public static void main(String[] args) {
        Person person = new Person("John", new Date(90, 1, 1), "Male", 1.80f, 80.0f, Country.USA);
        person.PrintPerson();
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

    public void PrintPerson() {
        System.out.println(this.name + " is a " + birthToAge() + " year old " + this.gender.toLowerCase() +
                " from " + this.nationality + ". They are " + this.height + "m tall and weigh " + this.weight + "kg.");
    }

    public int birthToAge () {
        Date now = new Date();
        return now.getYear() - birthDate.getYear();
    }
}
