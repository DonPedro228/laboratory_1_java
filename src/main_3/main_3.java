package main_3;

public class main_3 {
    public static void main(String[] args) {
        int h = 100;
        for (int i = 1; i <= h; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");
            }else if (i % 3 == 0){
                System.out.println("Fizz");
            } else {
            System.out.println(i);
            }
        }
    }
}
