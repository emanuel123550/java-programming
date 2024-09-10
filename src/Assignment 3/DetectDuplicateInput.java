import java.util.HashSet;
import java.util.Scanner;

public class DetectDuplicateInput {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        HashSet<Integer> numbersSet = new HashSet<>();


        int number;


        System.out.println("Enter numbers (enter a duplicate to stop):");

        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();


            if (numbersSet.contains(number)) {
                System.out.println("Duplicate number detected: " + number);
                break;
            } else {
                numbersSet.add(number);
            }
        }


        scanner.close();
    }
}

