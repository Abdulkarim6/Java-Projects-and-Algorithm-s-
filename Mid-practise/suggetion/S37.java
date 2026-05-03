//37. Develop a Java program to calculate the average of N numbers using arrays and loops.

import java.util.Scanner;

public class S37{
    public static void main(String []args){
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Enter total Number of numbers: ");
       int n = scan.nextInt();
       
       float[] arr = new float[n];
       
       for(int i = 0; i < arr.length; i++){
           System.out.print("at position " +i+ " Enter Number : ");
           arr[i] = scan.nextFloat();
       }
       
       float total = 0;
       for(int i = 0; i < arr.length; i++){
          total = total + arr[i];
       }
       
        float average = (total / n);
        System.out.print("Average of "+ n + " numbers is " + average);
       
       
     
       
    scan.close();
    }
}