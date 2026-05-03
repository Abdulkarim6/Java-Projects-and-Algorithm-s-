import java.util.Scanner;

public class S21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Use nextLine() to read full name

        // Input age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Input salary
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        // Output the information
        System.out.println("\n--- User Info ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);

        scanner.close();
    }
}
