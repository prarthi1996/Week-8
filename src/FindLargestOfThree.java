import java.util.Scanner;

public class FindLargestOfThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Digit: ");
        int x = scanner.nextInt();
        System.out.print("Enter a Digit: ");
        int y = scanner.nextInt();
        System.out.print("Enter a Digit: ");
        int z = scanner.nextInt();
        if (x > y && x > z) {

            System.out.println(x + " is the largest number");
        } else if (y > z) {
            System.out.println(y + " is the largest number");
        }
        else if(x==y && x==z && y==z){
            System.out.println("Error ! Please Enter Different Numbers");
        }
        else {
            System.out.println(z + " is the largest number");
        }


    }
}







