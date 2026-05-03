import java.util.Scanner;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase().replaceAll("[^a-z]", "");

            Integer count = wordCount.get(word);
            if (count == null) {
                wordCount.put(word, 1);
            } else {
                wordCount.put(word, count + 1);
            }
        }

        System.out.println("Word Frequencies:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + " " + wordCount.get(word));
        }

        scanner.close();
    }
}
