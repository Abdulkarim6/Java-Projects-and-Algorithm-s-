import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Type a string");

       String text = scanner.nextLine().toLowerCase();
       StringBuilder reversedText = new StringBuilder(text).reverse();
      
       boolean isPalindrome = text.equals(reversedText.toString());
    
       if(isPalindrome == true){
           System.out.println("The string is Palindrome");
       }
       else{
          System.out.println("The string is not Palindrome");
       }
       scanner.close();
    }
}