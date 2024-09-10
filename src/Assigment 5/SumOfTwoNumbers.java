
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        String num1Str = scanner.nextLine();

        System.out.print("Enter the second number: ");
        String num2Str = scanner.nextLine();


        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);


        int sum = num1 + num2;


        System.out.println("The sum of the two numbers is: " + sum);


        scanner.close();
    }
}
