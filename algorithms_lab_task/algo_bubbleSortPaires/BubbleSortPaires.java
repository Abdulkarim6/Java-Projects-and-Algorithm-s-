package algo_bubbleSortPaires;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BubbleSortPaires {

    public static void bubbleSort(int[][] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j][0] < arr[j + 1][0] || arr[j][0] == arr[j + 1][0] && arr[j][1] < arr[j + 1][1]) {
                    int[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        try {

            // int arr[] = { 2, 4, 6, 8, 2, 3, 9 };
            BufferedReader br = new BufferedReader(new FileReader("inp.txt"));
            String line = br.readLine().trim();
            int length = Integer.parseInt(line);

            int arr[][] = new int[length][2];

            for (int i = 0; i < length; i++) {
                String[] paires = br.readLine().trim().split("\\s+");
                arr[i][0] = Integer.parseInt(paires[0]);
                arr[i][1] = Integer.parseInt(paires[1]);
            }
            br.close();

            long startTime = System.currentTimeMillis();
            bubbleSort(arr);
            long endTime = System.currentTimeMillis();
            long totalTime = endTime - startTime;

            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            for (int i = 0; i < arr.length; i++) {
                writer.write(arr[i][0] + " " + arr[i][1] + "\n");
            }

            writer.write("Total Time Taken: " + totalTime + " ms");
            writer.close();

        } catch (Exception e) {
            System.out.print("Error: " + e.getMessage());
        }
    }
}