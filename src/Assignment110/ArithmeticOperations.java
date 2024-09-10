public class ArithmeticOperations {

    // Method to calculate the sum of two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Method to calculate the product of two integers
    public static int multiply(int a, int b) {
        // Try to access the 'result' variable from the main method
        // Uncommenting the following line will cause a compile-time error
        // int product = a * b + result;

        return a * b;
    }

    public static void main(String[] args) {
        // Declare an integer variable 'result' and assign the sum of two numbers
        int result = sum(5, 10);
        System.out.println("Sum: " + result);

        // Call the multiply method and print the result
        int product = multiply(5, 10);
        System.out.println("Product: " + product);
    }
}
