import java.util.Scanner;

public class FindLargestNumber{
    public static void main(String[] args){
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter the First Number:");
    int _1stNum = myObj.nextInt();

    System.out.println("Enter the Second Number:");
    int _2ndNum = myObj.nextInt();

    System.out.println("Enter the Third Number:");
    int _3rdNum = myObj.nextInt();

       if(_1stNum > _2ndNum && _1stNum > _3rdNum){
           System.out.println("The largest number is " + _1stNum);
       }
       else if(_2ndNum > _1stNum && _2ndNum > _3rdNum){
           System.out.println("The largest number is " + _2ndNum);
       }
       else{
           System.out.println("The largest number is " + _3rdNum);
       }
       myObj.close();
    }
}