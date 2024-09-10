import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the 1st number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the 2nd number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the 3rd number: ");
        int num3 = scanner.nextInt();


        System.out.println("1st Number = " + num1 + ", 2nd Number = " + num2 + ", 3rd Number = " + num3);


        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The 1st Number is the greatest among three.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The 2nd Number is the greatest among three.");
        } else {
            System.out.println("The 3rd Number is the greatest among three.");
        }


        scanner.close();
    }
}
