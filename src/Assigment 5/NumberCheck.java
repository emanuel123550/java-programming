import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();


        boolean isGreaterThan100 = number > 100;


        if (isGreaterThan100) {
            System.out.println("The number is greater than 100.");
        } else {
            System.out.println("The number is not greater than 100.");
        }


        scanner.close();
    }
}
