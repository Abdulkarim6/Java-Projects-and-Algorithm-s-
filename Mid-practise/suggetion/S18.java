//Declare an array of 5 integers, assign values, and print them using a for-each loop.

import java.util.Scanner;

public class S18{
    public static void main(String []args){
       //Scanner scan = new Scanner(System.in);
       
       //System.out.print("Enter a Number: ");
       
       int[] arr = new int[5];
       
       arr[0] = 2;
       arr[1] = 4;
       arr[2] = 6;
       arr[3] = 8;
       arr[4] = 10;
       
       for(int l:arr){
           System.out.println(l);
       }
       
    //scan.close();
    }
}
