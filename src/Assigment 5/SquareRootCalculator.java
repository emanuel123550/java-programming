
import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();


        double squareRoot = Math.sqrt(number);


        System.out.printf("The square root of %.2f is %.2f.%n", number, squareRoot);


        scanner.close();
    }
}
