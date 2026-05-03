import java.util.Scanner;

public class S40{
    public static void main(String []args){
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Enter a Sentance: ");
       String text = scan.nextLine();
       
       int countA = 0;
       int countE = 0;
       int countI = 0;
       int countO = 0;
       int countU = 0;
       
       for(int i = 0; i < text.length(); i++){
           char ch = Character.toLowerCase(text.charAt(i));
           
           switch(ch){
             case 'a':
                 countA++;
            break;
             case 'e':
                 countE++;
             break;
             case 'i':
                 countI++;
             break;
             case 'o':
                 countO++;
             break;
             case 'u':
                 countU++;
             break;
         }
         
      }  


System.out.print("frequency of Vowel \"A\" is " +countA+" times.\nfrequency of Vowel \"E\" is " +countE+" times.\nfrequency of Vowel \"I\" is " +countI+" times.\nfrequency of Vowel \"O\" is " +countO+" times.\nfrequency of Vowel \"U\" is " +countU+" times.");
      
    
    scan.close();
    }
}