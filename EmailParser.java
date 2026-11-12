import java.util.Scanner;

public class EmailParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter email:");
        String email = sc.nextLine();
        
      
        int index = email.indexOf('@');
       
        String username = email.substring(0, index);
        
      
        
        String domain = email.substring(index + 1);
        
        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);
    }
}