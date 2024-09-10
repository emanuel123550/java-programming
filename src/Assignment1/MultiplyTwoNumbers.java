import java.util.Scanner;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();


        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();


        double product = firstNumber * secondNumber;


        System.out.println("The product of " + firstNumber + " and " + secondNumber + " is: " + product);

        scanner.close();
    }
}
