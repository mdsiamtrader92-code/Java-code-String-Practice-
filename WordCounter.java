import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        
      
        sentence = sentence.trim();
        
        if (sentence.isEmpty()) {
            System.out.println("Number of words: 0");
        } else {
          
            String[] words = sentence.split("\\s+");
            System.out.println("Number of words: " + words.length);
        }
    }
}