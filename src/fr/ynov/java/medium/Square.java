package fr.ynov.java.medium;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int nbr = scanner.nextInt();

        System.out.println(square(nbr));
    }

    public static int square(int nbr) {
        return nbr * nbr;
    }
}
