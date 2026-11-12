import java.util.Scanner;

public class FullNameProcessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter full name:");
        String fullName = sc.nextLine();
        
        // a. Removes leading and trailing spaces using trim()
        fullName = fullName.trim();
        
        // b. Displays the cleaned name in uppercase
        String upperName = fullName.toUpperCase();
        System.out.println("Uppercase name: " + upperName);
        
        // c. Counts characters excluding spaces
        String noSpace = fullName.replace(" ", "");
        System.out.println("Characters without spaces: " + noSpace.length());
        
        // d. Splits the name into words and displays the first and last names
        String[] nameParts = fullName.split("\\s+");
        System.out.println("First name: " + nameParts[0]);
        System.out.println("Last name: " + nameParts[nameParts.length - 1]);
        
        // e. Checks whether the name contains "Ali" (or "Prioty" based on sample), ignoring case
        boolean containsKeyword = fullName.toLowerCase().contains("prioty".toLowerCase());
        if (containsKeyword) {
            System.out.println("Contains Prioty: Yes");
        } else {
            System.out.println("Contains Prioty: No");
        }
    }
}