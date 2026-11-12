import java.util.Scanner;

public class WordReplacer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Sentence:");
        String sentence = sc.nextLine();
        
        System.out.println("Search word:");
        String searchWord = sc.nextLine();
        
        System.out.println("Replacement word:");
        String replacementWord = sc.nextLine();
        
        if (sentence.contains(searchWord)) {
            String updatedSentence = sentence.replace(searchWord, replacementWord);
            System.out.println("Updated sentence: " + updatedSentence);
        } else {
            System.out.println("The search word does not exist in the sentence.");
        }
    }
}