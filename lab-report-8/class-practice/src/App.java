import java.io.IOException;

public class App {
    // static boolean isEven(int n) throws EvenNumberException {
    // or
    static boolean isEven(int n) {
        if (n % 2 == 0) {
            throw new EvenNumberException("null");
        }
        return false;
    }

    public static void main(String[] args) throws EvenNumberException {
        try {
            int a = 10;
            isEven(a);

            int arr[] = new int[5];
            for (int i = 0; i < 5; i++) {
                arr[i] = i * a;
                System.out.print(arr[i] + " ");
            }
            System.out.print(" ");
            System.out.println(a / 0);
        } catch (ArithmeticException e) {
            System.out.println("EXception:" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null pointer: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception at herer: " + e.getMessage());
        }
        System.out.println("Hello World");
    }
}