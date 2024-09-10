
import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter a sentence:");
        String Sentence = Scanner.nextLine();
        String[] words = Sentence.split("");
        String longestWords = "";

        for (String word:words){
            if (word.length() > longestWords.length()){
                longestWords = word;
            }
        }
        System.out.print("The longest word is."+longestWords);
    }
}