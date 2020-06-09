import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = scanner.nextInt();
        switch (num%2){
            case 0:
                System.out.println(num + " is Even Number");
                break;

            case 1:
                System.out.println(num + " is Odd Number");
                break;

        }


        }

        }



