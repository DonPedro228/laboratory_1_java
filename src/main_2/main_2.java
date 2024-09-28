package main_2;
import java.util.Scanner;
import java.util.regex.Pattern;

public class main_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String signs = "+-*/";
        System.out.println("Enter string: ");
        String string = scanner.nextLine();

        char operator = 0;
        for (int i = 0; i < string.length(); i++) {
            if (signs.indexOf(string.charAt(i)) >= 0) {
                operator = string.charAt(i);
                break;
            }
        }
        if (operator == 0) {
            System.out.println("Error: No operator found");
        } else {
            System.out.println("Operator: " + operator);

            String operator_string = Pattern.quote(Character.toString(operator));

            String[] parts = string.split(operator_string);

            if (parts.length == 2) {
                System.out.println("Left String: " + parts[0].trim());
                System.out.println("Right String: " + parts[1].trim());


                String rightPart = parts[1].replaceAll("[^0-9]", "").trim();


                if (!rightPart.isEmpty()) {
                    int leftOperand = Integer.parseInt(parts[0].trim());
                    int rightOperand = Integer.parseInt(rightPart);

                    int result = 0;
                    switch (operator) {
                        case '+':
                            result = leftOperand + rightOperand;
                            break;
                        case '-':
                            result = leftOperand - rightOperand;
                            break;
                        case '*':
                            result = leftOperand * rightOperand;
                            break;
                        case '/':
                            if (rightOperand != 0) {
                                result = leftOperand / rightOperand;
                            } else {
                                System.out.println("Error: Division by zero");
                                return;
                            }
                            break;
                    }
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: No number found on the right side");
                }
            } else {
                System.out.println("Error: Expression is not valid");
            }
        }
    }
}
