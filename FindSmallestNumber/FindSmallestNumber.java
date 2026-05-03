import java.util.Scanner;

public class FindSmallestNumber{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer number");
        int firstNum = scanner.nextInt();
        System.out.println("Enter second integer number");
        int secondNum = scanner.nextInt();
        System.out.println("Enter third integer number");
        int thirdNum = scanner.nextInt();

        if(firstNum < secondNum && firstNum < thirdNum){
            System.out.println(firstNum + " is smallest among them.");
        }
        else if(secondNum < firstNum && secondNum < thirdNum){
            System.out.println(secondNum + " is smallest among them.");
        }
        else{
            System.out.println(thirdNum + " is smallest among them.");
        }
        scanner.close();
    }
}