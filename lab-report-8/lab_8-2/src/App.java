import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int arr[] = { 1, 2, 3, 4, 5 };
        String str = null;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the index number for print the value of array: ");
        int indexNum = scanner.nextInt();

        try {
            System.out.println("At index " + indexNum + " the value is: " + arr[indexNum]);
            System.out.println("Length of null string: " + str.length());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Warning: " + e.getMessage() + " of array");
        } catch (NullPointerException e) {
            System.out.println("Warning: Attempted to access a null string.");
        }

        scanner.close();
    }
}
