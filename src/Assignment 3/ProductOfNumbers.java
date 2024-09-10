public class ProductOfNumbers {
    public static void main(String[] args) {
        
        int product = 1;
        int number = 1;


        while (number <= 5) {
            product *= number; // Multiply the product by the current number
            number++;          // Increment the number
        }


        System.out.println("The product of numbers from 1 to 5 is: " + product);
    }
}
