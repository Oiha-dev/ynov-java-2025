package fr.ynov.java.medium;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String line = sc.nextLine();

        String reversedLine = "";
        for (int i = line.length() - 1; i >= 0; i--) {
            reversedLine += line.charAt(i);
        }

        if (line.equals(reversedLine)) {
            System.out.println(line + " is a palindrome");
        } else {
            System.out.println(line + " is not a palindrome");
        }
    }
}
