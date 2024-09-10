import java.util.Scanner;

public class CheckIntegersEqual {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();


        if (num1 == num2) {
            System.out.println("Number1 and Number2 are equal");
        } else {
            System.out.println("Number1 and Number2 are not equal");
        }


        scanner.close();
    }
}

