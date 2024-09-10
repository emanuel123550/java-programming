import java.util.Scanner;

public class MatrixTranspose {
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

        // Compute the transpose of the matrix
        int[][] transpose = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Output the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Output the transposed matrix
        System.out.println("Transposed Matrix:");
        printMatrix(transpose);

        scanner.close();
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
