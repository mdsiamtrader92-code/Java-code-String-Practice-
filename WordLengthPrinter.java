import java.util.Scanner;

public class WordLengthPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        
        sentence = sentence.trim();
        
        if (sentence.isEmpty()) {
            System.out.println("Number of words: 0");
        } else {
            String[] words = sentence.split("\\s+");
            
            for (int i = 0; i < words.length; i++) {
                System.out.println("Word " + (i + 1) + ": " + words[i] + " (Length: " + words[i].length() + ")");
            }
            
            System.out.println("Also display the total number of words: " + words.length);
        }
    }
}