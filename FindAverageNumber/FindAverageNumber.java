import java.util.Scanner;

public class FindAverageNumber{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the First Number:");
    int firstNum = scanner.nextInt();

    System.out.println("Enter the Second Number:");
    int secondNum = scanner.nextInt();

    System.out.println("Enter the Third Number:");
    int thirdNum = scanner.nextInt();

    System.out.println("Enter the Fourth Number:");
    int fourthNum = scanner.nextInt();

    float average = ((firstNum + secondNum + thirdNum + fourthNum) / 4.0f);
    System.out.println("The Average Number is "+ average);
    scanner.close();
    }
}