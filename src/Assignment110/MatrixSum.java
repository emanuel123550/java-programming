import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the size of the matrix
        final int SIZE = 3;

        // Create a 3x3 matrix
        int[][] matrix = new int[SIZE][SIZE];

        // Input the matrix elements from the user
        System.out.println("Enter the elements of a 3x3 matrix:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate and print the sum of each row
        System.out.println("\nSum of each row:");
        for (int i = 0; i < SIZE; i++) {
            int rowSum = 0;
            for (int j = 0; j < SIZE; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Sum of row " + i + ": " + rowSum);
        }

        // Calculate and print the sum of each column
        System.out.println("\nSum of each column:");
        for (int j = 0; j < SIZE; j++) {
            int colSum = 0;
            for (int i = 0; i < SIZE; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Sum of column " + j + ": " + colSum);
        }

        scanner.close();
    }
}
