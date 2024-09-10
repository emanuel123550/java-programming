import java.util.Scanner;

public class ConcatenateNumbersAsStrings {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        String num1Str = scanner.nextLine();


        System.out.print("Enter the second number: ");
        String num2Str = scanner.nextLine();


        String concatenatedResult = num1Str + num2Str;


        System.out.println("The concatenated result is: " + concatenatedResult);


        scanner.close();
    }
}
