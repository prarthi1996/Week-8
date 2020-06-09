import java.util.Scanner;

public class Calculator {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter two numbers: ");

            // nextDouble() reads the next double from the keyboard
            double first = scanner.nextDouble();
            double second = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double result;

            switch(operator)
            {
                case '+':
                    result = first + second;
                    System.out.println("Addition of two number is: " +result);
                    break;

                case '-':
                    result = first - second;
                    System.out.println("Subtraction of two number is: " +result);
                    break;

                case '*':
                    result = first * second;
                    System.out.println("Multiplication of two number is: " +result);
                    break;

                case '/':
                    result = first / second;
                    System.out.println("Division of two number is: " +result);
                    break;

                // operator doesn't match any case constant (+, -, *, /)
                default:
                    System.out.printf("Error! operator is not correct");

            }

        }

}
