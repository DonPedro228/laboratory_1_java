package main;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number: ");
        int number = scanner.nextInt();
        String binary_s = "";

        if (number == 0) {
            binary_s = "0";
        } else {
            while (number > 0) {
                binary_s = (number % 2) + binary_s;
                number = number / 2;
            }
        }

        System.out.println("Result: " + binary_s);
    }
}
