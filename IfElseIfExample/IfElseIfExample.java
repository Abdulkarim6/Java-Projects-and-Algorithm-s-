import java.util.Scanner;

public class IfElseIfExample {
public static void main(String[] args) {
        Scanner newObj = new Scanner (System.in);
        System.out.println("Enter your obtained mark or -1 for course incomplete");

        float mark = newObj.nextFloat();  
        newObj.close();

        if(mark == -1 ){
            System.out.println("Your Grade is I+(incomplete)");
        }
        else if(mark >= 80 ){
            System.out.println("Your Grade is A+");
        }
        else if(mark >= 75 && mark < 80){
            System.out.println("Your Grade is A");
        }
        else if(mark >= 70 && mark < 75){
            System.out.println("Your Grade is A-");
        }
        else if(mark >= 65 && mark < 70){
            System.out.println("Your Grade is B+");
        }
        else if(mark >= 60 && mark < 65){
            System.out.println("Your Grade is B");
        }
        else if(mark >= 55 && mark < 60){
            System.out.println("Your Grade is B-");
        }
        else if(mark >= 50 && mark < 55){
            System.out.println("Your Grade is C+");
        }
        else if(mark >= 45 && mark < 50){
            System.out.println("Your Grade is C");
        }
        else if(mark >= 40 && mark < 45){
            System.out.println("Your Grade is D+");
        }
        else {
            System.out.println("Your Grade is F(fail)");
        }
    }
}