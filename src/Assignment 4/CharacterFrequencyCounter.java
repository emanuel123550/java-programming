import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequencyCounter {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        HashMap<Character, Integer> frequencyMap = new HashMap<>();


        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (frequencyMap.containsKey(ch)) {
                // If the character is already in the map, increment its frequency
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            } else {

                frequencyMap.put(ch, 1);
            }
        }


        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        scanner.close();
    }
}

