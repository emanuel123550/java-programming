public class VowelConsonantCounter {
    public static void main(String[] args) {
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        int vowelCount = 0;
        int consonantCount = 0;


        String lowerCaseInput = input.toLowerCase();


        for (int i = 0; i < lowerCaseInput.length(); i++) {
            char ch = lowerCaseInput.charAt(i);


            if (Character.isLetter(ch)) {

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }


        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);


        scanner.close();
    }
}
