import java.util.Scanner;

public class Matrix_Addition{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the size of the matrices
        final int SIZE = 2;

        // Create 2x2 matrices
        int[][] matrix1 = new int[SIZE][SIZE];
        int[][] matrix2 = new int[SIZE][SIZE];
        int[][] resultMatrix = new int[SIZE][SIZE];

        // Input elements for the first matrix
        System.out.println("Enter the elements of the first 2x2 matrix:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print("Enter element (" + i + ", " + j + "): ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input elements for the second matrix
        System.out.println("Enter the elements of the second 2x2 matrix:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print("Enter element (" + i + ", " + j + "): ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Perform matrix addition
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print the resulting matrix
        System.out.println("The resulting matrix after addition is:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
