import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<String> studentNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input five student Names: ");
        for (int i = 0; i < 5; i++) {
            String name = scanner.nextLine();
            studentNames.add(name);
        }

        Collections.sort(studentNames);

        System.out.println("Sorted Student Names:");
        for (String name : studentNames) {
            System.out.println(name);
        }

        scanner.close();
    }
}
