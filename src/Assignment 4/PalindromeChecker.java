public class PalindromeChecker {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        String cleanedInput = input.toLowerCase().replaceAll("\\s+", "");


        String reversedInput = new StringBuilder(cleanedInput).reverse().toString();


        if (cleanedInput.equals(reversedInput)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }


        scanner.close();
    }
}

