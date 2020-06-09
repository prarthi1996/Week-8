import java.util.Scanner;

public class PositiveNegativeZero {
    public static int positive(int number){
        if (number>0){
            return 1;
        }
        else if (number<0) {
            return 0;
        }
        else if (number == 0){
            return -1;
        }
        else{
            return 2;
        }

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Digit: ");
        int number = scanner.nextInt();
        int numID= positive(number);
        switch (numID){
            case 0:
                System.out.println("Number is Negative");
                break;
            case 1:
                System.out.println("Number is positive");
                break;
            case -1:
                System.out.println("Number is Zero");

        }

            }
        }








