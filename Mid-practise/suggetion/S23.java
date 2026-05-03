import java.util.Scanner;

public class S23{
    public static void main(String []args){
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Enter a Number of day: ");
       int day = scan.nextInt();
       
       switch(day){
           case 1:
            System.out.print("it is sunday.");
            break;
           case 2:
            System.out.print("it is monday.");
            break;
           case 3:
            System.out.print("it is tuesday.");
            break;
           case 4:
            System.out.print("it is wednesday.");
            break;
           case 5:
            System.out.print("it is thursday.");
            break;
           case 6:
            System.out.print("it is friday.");
            break;
           case 7:
            System.out.print("it is saturday.");
            break;
           default:
            System.out.print("Please input within 1 to 7 number!");
            break;
       }
       
    scan.close();
    }
}