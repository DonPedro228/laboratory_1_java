package main_5;
import java.util.Scanner;

public class main_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Input Size of Matrix: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[][] words = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Input words [" + i + "][" + j + "]: ");
                words[i][j] = scanner.nextLine();
            }
        }



        System.out.println("\nCompleted Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(words[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nEnter the world:");
        String searched_word = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(words[i][j].equals(searched_word)) {
                    count++;
                }
            }
        }
        System.out.println("\nCount: " + count);

        scanner.close();
    }
}
