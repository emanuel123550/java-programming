import java.util.Scanner;

public class SumOfDigitsCalculator {

    
    public static int sumOfDigits(int number) {
        if (number == 0) {
            return 0;
        } else {
            return (number % 10) + sumOfDigits(number / 10); // Recursive case
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter an integer to calculate the sum of its digits: ");
        int number = scanner.nextInt();


        int result = sumOfDigits(number);


        System.out.println("The sum of the digits of " + number + " is: " + result);

        scanner.close();
    }
}
