package fr.ynov.java.easy;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int nbr = sc.nextInt();
        if (nbr % 2 == 0) {
            System.out.println(nbr + " is even");
        } else {
            System.out.println(nbr + " is odd");
        }
    }
}
