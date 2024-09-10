
import java.util.Scanner;

public class CharacterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();


        System.out.print("Enter a character to search for: ");
        char searchChar = scanner.next().charAt(0);


        int position = -1;


        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == searchChar) {
                position = i;
                System.out.println("The character '" + searchChar + "' is found at index: " + position);
                break;
            }
        }


        if (position == -1) {
            System.out.println("The character '" + searchChar + "' is not found in the string.");
        }


        scanner.close();
    }
}
