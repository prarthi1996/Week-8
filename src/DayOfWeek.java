import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert Number Between 1 to 7 : ");
        char key = scanner.next().charAt(0);
        switch (key) {
            case '1':
                System.out.println(" Sunday ");
                break;
            case '2':
                System.out.println("Monday ");
                break;
            case '3':
                System.out.println(" Tuesday ");
                break;
            case '4':
                System.out.println(" Wednesday ");
                break;
            case '5':
                System.out.println(" Thursday ");
                break;
            case '6':
                System.out.println("Friday ");
                break;
            case '7':
                System.out.println(" Saturday ");
                break;
            default:
                System.out.println("Invalid Choice");
        }

    }
}

