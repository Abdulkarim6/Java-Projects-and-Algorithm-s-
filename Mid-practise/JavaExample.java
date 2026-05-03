//---------------------------------------------------------------------------------------------

/**
import java.util.Scanner;

public class HelloWorld{

     public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         
        System.out.println("Enter an alphabet");
        //char ch = Character.toLowerCase(scan.next().charAt(0));
        char ch = scan.next().charAt(0);

         
         switch(ch){
             case 'a':
             case 'e':
             case 'i':
             case 'o':
             case 'u':
             System.out.println(ch + " is vowel");
             break;
             case 'A':
             case 'E':
             case 'I':
             case 'O':
             case 'U':
             System.out.println(ch + " is vowel");
             break;
             default:
             System.out.println(ch + " is consonent");
             break;
         }
     }
}
*/

//---------------------------------------------------------------------------------------------

/**
import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] arges){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the temperature");
        int temp = scan.nextInt();
        
        if(temp > 30){
            System.out.println("turn on the air conditioner.");
        }
        else{
            System.out.println("No need to turn on the air conditioner.");
        }
    }
}
*/

//---------------------------------------------------------------------------------------------

/*
import java.util.Scanner;

public class HelloWorld{
    
    static void check(){
     Scanner scan = new Scanner(System.in);
        
        System.out.println("Information: Enter the temperature");
        int temp = scan.nextInt();
        
        if(temp > 30){
            System.out.println("Result: Turn on the air conditioner.");
        }
        else{
            System.out.println("Result: No need to turn on the air conditioner.");
        }
       
        
         System.out.println("Warning: if you want check again then enter 1 otherwise enter any integer to close the program");
         int ifYes = scan.nextInt();
         
         if(ifYes == 1){
             check();
         }else{
            System.out.println("Have a good day");
         }
    }
    
    
    public static void main(String[] arges){
         check();
    }
}
*/

//---------------------------------------------------------------------------------------------

/*
import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] arge){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your obtained mark");
        int mark = scan.nextInt();
        
        if(100 < mark){
            System.out.println("You can not enter greater then 100 as mark!");
        }
        else if(100 >= mark && mark >= 80){
            System.out.println("You obtained Grade A+");
        }
        else if(75 <= mark && mark < 80){
            System.out.println("You obtained Grade A");
        }
        else if(65 <= mark && mark < 75){
            System.out.println("You obtained Grade A-");
        }
        else if(55 <= mark && mark < 65){
            System.out.println("You obtained Grade B");
        }
        else{
            System.out.println("So sad!!! your grade is F");
        }
    }
}
*/

//-----------------------------Loop Start--------------------------------------------

/*
import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Enter the Number: ");
       int N = scan.nextInt();
      
       for(int i = 1; i <= N ; i++ ){
          for(int j = 1; j <= i ; j++ ){
           System.out.print("# ");
          }
        System.out.println("");
       }
    }
}

input: 5
output: 
# 
# # 
# # # 
# # # # 
# # # # # 
*/

//-----------------------------Loop Start--------------------------------------------

/*
import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Enter the Number: ");
       int N = scan.nextInt();
      
       for(int i = N; i >= 1 ; i-- ){
           
          for(int j = 1; j <= i ; j++){
           System.out.print("# ");
          }
          
        System.out.println("");
       }
    }
}

input: 5
output: 
# # # # # 
# # # # 
# # # 
# # 
# 

*/
/*
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter nth number: ");
        int n = scan.nextInt();
        
        for(int i = 1; i <= n; i++){
            
            for(int j = i; j <= n-1; j++){
                System.out.print(" ");
            }
            
            for(int j =1; j <= i; j++){
                System.out.print("# ");
            }
            System.out.print("\n");
             
        }
        
        for(int i = 1; i <= n-1; i++){
            
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            
            for(int j = i; j <= n-1; j++){
                System.out.print("# ");
            }
            System.out.print("\n");
             
        }
    }
}

input: 5
output: 
    # 
   # # 
  # # # 
 # # # # 
# # # # # 
 # # # # 
  # # # 
   # # 
    # 

*/

/*
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter nth number: ");
        int n = scan.nextInt();
        
        for(int i =1; i <= n; i++){
            for(int j = i; j <= n -1; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i*2 -1; k++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
        
        for(int i = n-1; i > 0; i--){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i*2 -1; k++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}

input: 5
output: 
    #
   ###
  #####
 #######
#########
 #######
  #####
   ###
    #
*/

/**
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter text: ");
        String text = scan.next().toLowerCase();
        
        int count = 0;
        for(int i =0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            count++;
            }
           
        }
        System.out.print("Number of vowels: " + count);
    }
}
input: BEaUtiful
output: Number of vowels: 5
*/

//-----------------------------Array Start--------------------------------------------

/*
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter array of integer size: ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter " + n + " integer: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter lement at index " + i + ": ");
            arr[i] = scan.nextInt();
        }
        
        int maxi = arr[0];
        int index = 0;
        for(int i = 1; i < arr.length; i++){
            if(maxi < arr[i]){
               maxi = arr[i];
               index = i;
            }
        }
       
        System.out.println("maxi Number: " + maxi);
        System.out.print("index : " + index);
    }
}

input: Enter array of integer size: 4
output: 
Enter 4 integer: 
Enter lement at index 0: 3
Enter lement at index 1: 6
Enter lement at index 2: 3
Enter lement at index 3: 5
maxi Number: 6
index : 1
*/
