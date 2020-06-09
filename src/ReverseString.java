import com.sun.javafx.binding.StringFormatter;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        System.out.println("Enter string to Reverse: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String reverse = " ";
        StringBuilder stringBuilder = new StringBuilder(string);
        System.out.println("Reverse String is: "+stringBuilder.reverse().toString()+ reverse);

    }
}
