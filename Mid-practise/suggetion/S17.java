//Write a Java program to check if a number is even or odd using an if-else statement.

import java.util.Scanner;

public class S17{
    public static void main(String []args){
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Enter a Number: ");
       int num = scan.nextInt();
       
       if(num % 2 == 0){
          System.out.println(num + " is a even Number.");
       }
       else{
          System.out.println(num + " is a odd Number.");
       }
       
    scan.close();
    }
}