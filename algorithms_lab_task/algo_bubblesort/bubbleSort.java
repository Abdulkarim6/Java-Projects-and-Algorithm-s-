import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class bubbleSort {

       public static void BubbleSort(int[] arr) {
              int n = arr.length;

              for (int i = 0; i < n - 1; i++) {
                     for (int j = 0; j < n - 1 - i; j++) {
                            if (arr[j] > arr[j + 1]) {
                                   int temp = arr[j];
                                   arr[j] = arr[j + 1];
                                   arr[j + 1] = temp;
                            }
                     }
              }
       }

       public static void main(String[] args) {
              try {

                     // int arr[] = { 2, 4, 6, 8, 2, 3, 9 };
                     BufferedReader br = new BufferedReader(new FileReader("input.txt"));
                     String line = br.readLine().trim();
                     int length = Integer.parseInt(line);

                     int arr[] = new int[length];

                     for (int i = 0; i < length; i++) {
                            arr[i] = Integer.parseInt(br.readLine().trim());
                     }
                     br.close();

                     BubbleSort(arr);

                     BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
                     for (int i = 0; i < arr.length; i++) {
                            writer.write(arr[i] + "\n");
                     }

                     writer.close();

                     // for (int i : arr) {
                     // System.out.print(" " + i);
                     // }
              } catch (Exception e) {
                     System.out.print(e.getMessage() + "err");
              }
       }
}