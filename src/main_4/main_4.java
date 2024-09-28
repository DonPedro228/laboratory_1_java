package main_4;
import java.util.Scanner;

public class main_4 {
    public static void main(String[] args) {
        CountSymbol[] symbols = new CountSymbol[256];
        for (int i = 0; i < symbols.length; i++) {
            symbols[i] = new CountSymbol();
        }

        int[] uniqueCount = {0};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text:");
        String text = scanner.nextLine();

        CountSymbol.countSymbols(text, symbols, uniqueCount);
        CountSymbol.displayCount(symbols, uniqueCount[0]);

        scanner.close();
    }
}

