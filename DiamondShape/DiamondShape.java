import java.util.Scanner;

public class DiamondShape{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a nth integer");
        int n = scanner.nextInt();

        int space = n - 1;
    
       for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < space; j++)
                System.out.print(" ");
    
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
    
            System.out.print("\n");
            space--;
        }
    
        space = 1;
    
        for (int i = n-1; i > 0; i--)
         {
            for (int j = 0; j < space; j++)
                 System.out.print(" ");
           
            for (int j = 0; j < i; j++)
                 System.out.print("* ");
     
             System.out.print("\n");
             space++;
         }
      scanner.close();
    }
}