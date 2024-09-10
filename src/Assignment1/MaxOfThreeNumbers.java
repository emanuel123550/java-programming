import java.util.Scanner;

public class MaxOfThreeNumbers {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();


        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();


        System.out.print("Enter the third number: ");
        double thirdNumber = scanner.nextDouble();


        double max;


        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            max = firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            max = secondNumber;
        } else {
            max = thirdNumber;
        }


        System.out.println("The maximum of the three numbers is: " + max);


        scanner.close();
    }
}
