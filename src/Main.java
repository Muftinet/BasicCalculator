import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char operator;
        double number1, number2, result;

        // Object of a Scanner class
        Scanner scanner = new Scanner(System.in);

        // Ask Users to enter first number
        System.out.println("Enter first number");
        number1 = scanner.nextDouble();

        // Ask Users to choose Operator
        System.out.println("Enter your selection: 1 for Addition, 2 for subtraction 3 for Multiplication and 4 for division:");
        operator = scanner.next().charAt(0);

        // Ask users to enter second number
        System.out.println("Enter second number");
        number2 = scanner.nextDouble();

        switch (operator) {

            // Perform addition between numbers
            case '1':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // Perform Subtraction between numbers
            case '2':
                result = number1 - number2;
                System.out.println(number1 + " -" + number2 + " = " + result);
                break;

            // Perform Multiplications between numbers
            case '3':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // Perform Division between numbers
            case '4':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid Operator!");
                break;
        }

        scanner.close();
    }


}