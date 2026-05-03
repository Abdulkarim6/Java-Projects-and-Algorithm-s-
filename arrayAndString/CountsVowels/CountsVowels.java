import java.util.Scanner;

public class CountsVowels{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a string");
        String text = scanner.nextLine().toLowerCase();

        int count = 0;
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            count++;
        }
        System.out.println("Number of vowels: " + count);
        scanner.close();
    }
}