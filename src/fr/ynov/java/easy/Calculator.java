package fr.ynov.java.easy;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int nbr1 = Integer.parseInt(args[0]);
        int nbr2 = Integer.parseInt(args[1]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an operator : ");

        String op = sc.nextLine();

        switch (op) {
            case "+":
                System.out.println(nbr1 + nbr2);
                break;
            case "-":
                System.out.println(nbr1 - nbr2);
                break;
            case "*":
                System.out.println(nbr1 * nbr2);
                break;
            case "/":
                System.out.println(nbr1 / nbr2);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
