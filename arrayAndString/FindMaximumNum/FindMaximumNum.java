import java.util.Scanner;

public class FindMaximumNum{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size");
        int size = scanner.nextInt();

        int arr[] = new int[size];
        
        System.out.println("Enter " + size + " integers for the array");
        for(int i = 0; i < size; i++){
            System.out.print("Enter lement at index " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        
        int maximumNum = arr[0];
        int index = 0;
        for(int i = 1; i < arr.length; i++){
            if( maximumNum < arr[i]){
                maximumNum = arr[i];
                index = i;
            }
         }

        System.out.println("The maximum number is "+ maximumNum + " at index "+ index);
        scanner.close();
    }
}