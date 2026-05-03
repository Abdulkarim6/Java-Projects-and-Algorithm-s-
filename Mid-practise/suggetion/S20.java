import java.util.Scanner;

class S20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String text = scan.next();
        
        String reversedText = "";
        for(int i = text.length() - 1; i >=0 ; i--){
            reversedText = reversedText + text.charAt(i);
        }
        
        if(reversedText.equals(text)){
            System.out.println(text + " is palindrome.");
        }
        else{
            System.out.println(text + " is not palindrome.");
        }
        
    }
}