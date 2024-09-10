public class LongestWordFinder {
    public static void main(String[] args) {
       
        java.util.Scanner scanner = new java.util.Scanner(System.in);


        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();


        String[] words = sentence.split("\\s+");


        String longestWord = "";
        int maxLength = 0;


        for (String word : words) {
            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }


        System.out.println("The longest word is: " + longestWord);
        System.out.println("Length of the longest word: " + maxLength);


        scanner.close();
    }
}

