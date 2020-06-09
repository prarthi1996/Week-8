import java.util.Scanner;

public class KeyPress {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Press a key : ");
            char key = scanner.next().charAt(0);
            switch (key) {
                case '0':
                    System.out.println("You Pressed 0. ");
                    break;
                case '1':
                    System.out.println("You Pressed 1. ");
                    break;
                case '2':
                    System.out.println("You Pressed 2. ");
                    break;
                case '3':
                    System.out.println("You Pressed 3. ");
                    break;
                case '4':
                    System.out.println("You Pressed 4. ");
                    break;
                case '5':
                    System.out.println("You Pressed 5. ");
                    break;
                case '6':
                    System.out.println("You Pressed 6. ");
                    break;
                case '7':
                    System.out.println("You Pressed 7. ");
                    break;
                case '8':
                    System.out.println("You Pressed 8. ");
                    break;
                case '9':
                    System.out.println("You Pressed 9. ");
                    break;
                default:
                    System.out.println("Not Allowed");
            }

        }
    }

