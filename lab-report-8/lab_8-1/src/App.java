import java.util.Scanner;

public class App {
    void division() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Integer: ");
        int _1stNum = scanner.nextInt();
        System.out.print("Enter Second Integer: ");
        int _2ndNum = scanner.nextInt();

        try {
            if (_2ndNum == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            } else {
                double result = (double) _1stNum / _2ndNum;
                System.out.println("The Result is: " + result);
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Operation Complete");
            scanner.close();
        }
    }

    public static void main(String[] args) throws Exception {
        App obj = new App();
        obj.division();
    }
}
