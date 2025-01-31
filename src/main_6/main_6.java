package main_6;

import java.util.Scanner;

public class main_6 {


    public static void main(String[] args) {
        Currency[] rates = {
                new Currency("UAH", 42.5),
                new Currency("USD", 1),
                new Currency("CAD", 1.4),
                new Currency("EUR", 0.9)
        };

        int size = rates.length;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter conversion (Example: '100 UAH into USD'): ");
        String input = scanner.nextLine();

        double amount;
        String inCurrency, outCurrency;

        if (parseInput(input)) {
            String[] parsedData = input.split(" ");
            amount = Double.parseDouble(parsedData[0]);
            inCurrency = parsedData[1];
            outCurrency = parsedData[3];

            double result = convert(amount, inCurrency, outCurrency, rates, size);
            if (result != -1) {
                System.out.println(amount + " " + inCurrency + " = " + result + " " + outCurrency);
            }
        }
    }

    public static double findRate(String currencyCode, Currency[] rates, int size) {
        for (int i = 0; i < size; i++) {
            if (rates[i].code.equals(currencyCode)) {
                return rates[i].rate;
            }
        }
        return -1;
    }


    public static double convert(double amount, String inCurrency, String outCurrency, Currency[] rates, int size) {
        if (inCurrency.equals(outCurrency)) {
            return amount;
        }

        double inRate = findRate(inCurrency, rates, size);
        if (inRate == -1) {
            System.out.println("Error: Currency " + inCurrency + " not found!");
            return -1;
        }

        double outRate = findRate(outCurrency, rates, size);
        if (outRate == -1) {
            System.out.println("Error: Currency " + outCurrency + " not found!");
            return -1;
        }

        double amountInUsd = amount / inRate;
        return amountInUsd * outRate;
    }

    public static boolean parseInput(String input) {
        String[] parts = input.split(" ");
        if (parts.length != 4 || !parts[2].equals("into")) {
            System.out.println("Error: Incorrect format. Please use format '100 UAH into USD'.");
            return false;
        }
        return true;
    }
}
