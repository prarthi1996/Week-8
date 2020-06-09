import java.util.Scanner;

public class CityName {
    public static void main(String args[]) {

        System.out.println("Enter a character :");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        switch(ch) {
            case 'a' :
                System.out.println("Ahemdabad");
                break;
            case 'b' :
                System.out.println("Banglore ");
                break;
            case 'c' :
                System.out.println("Chennai ");
                break;
            case 'd' :
                System.out.println("Delhi ");
                break;
            case 'e' :
                System.out.println("Ellora ");
                break;
            case 'f' :
                System.out.println("Firozabad ");
                break;


            default:
                System.out.println("Invalid Entry ");

        }

    }
}
