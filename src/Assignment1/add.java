import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");
        int a;
        int b;
        int c;
        System.out.println("enter the value of a");
        a = myObj.nextInt();
        System.out.println("entre the value of b");
        b = myObj.nextInt();

        c=a+b;
        System.out.println("Total: " + c);
    }
}