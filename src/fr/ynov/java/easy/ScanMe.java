package fr.ynov.java.easy;

import java.util.Scanner;

public class ScanMe {
    public static void main(String[] args) {
        Scanner Name = new Scanner(System.in);
        System.out.println("Enter name");
        String userName = Name.nextLine();


        Scanner Age = new Scanner(System.in);
        System.out.println("Enter age");
        int age = Age.nextInt();
        System.out.println(userName + " " + age + " years old");
    }
}
