package Assignment1;

import java.util.Scanner;

public class PalindromeCheckerForLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();


        boolean isPalindrome = true;


        originalString = originalString.toLowerCase();


        int length = originalString.length();
        for (int i = 0; i < length / 2; i++) {
            if (originalString.charAt(i) != originalString.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }


        if (isPalindrome) {
            System.out.println(originalString + " is a palindrome.");
        } else {
            System.out.println(originalString + " is not a palindrome.");
        }


        scanner.close();
    }
}

