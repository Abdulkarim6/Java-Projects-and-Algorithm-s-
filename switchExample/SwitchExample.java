import java.util.Scanner;

public class SwitchExample{
    public static void main(String[] agrs){
        Scanner takeCh = new Scanner(System.in);

        System.out.println("Enter an alphabet");
        String ch = takeCh.nextLine();
        ch = ch.toUpperCase();

        switch(ch){
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
            System.out.println(ch+ " is a Vowel");
            break;
            default:
            System.out.println(ch+ " is a Consonant");
            break;
        }
        takeCh.close();
    }
}

