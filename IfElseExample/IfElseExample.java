import java.util.Scanner;

public class IfElseExample{ 
    public static void main(String[] args) {
        Scanner newObj = new Scanner (System.in);
        System.out.println("Enter a year to check if it is a leap year or not");

        int givenYear = newObj.nextInt();  
        newObj.close();

        if((givenYear % 4 == 0 && givenYear % 100 != 0) || (givenYear % 400 == 0)){
            System.out.println(givenYear + " is a leap year");
        }
        else{
            System.out.println(givenYear + " is a not leap year");
        }
    }
}

//A year is a leap year if it is divisible by 4 and not divisible by 100,
// or if it is divisible by 400.