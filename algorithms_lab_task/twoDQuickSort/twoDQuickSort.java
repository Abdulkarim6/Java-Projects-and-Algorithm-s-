package twoDQuickSort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class twoDQuickSort {

    public static void Swap(int[][] arr, int i, int j) {
        int[] temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int Partition(int[][] arr, int low, int high) {
        int i = low - 1;
        int[] pivot = arr[high];
        for (int j = low; j < high; j++) {
            if (arr[j][0] < pivot[0] || arr[j][0] == pivot[0] && arr[j][1] < pivot[1]) {
                i++;
                Swap(arr, i, j);
            }
        }

        i++;
        Swap(arr, i, high);

        return i;
    }

    public static void QuickSort(int[][] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = Partition(arr, low, high);
            QuickSort(arr, low, pivotIndex - 1);
            QuickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("twoDQuickSortInput.txt"));
            String ln = br.readLine().trim();
            int length = Integer.parseInt(ln);

            int[][] arr = new int[length][2];
            for (int i = 0; i < arr.length; i++) {
                String[] paires = br.readLine().trim().split("\\s+");
                arr[i][0] = Integer.parseInt(paires[0]);
                arr[i][1] = Integer.parseInt(paires[1]);
            }

            br.close();

            QuickSort(arr, 0, arr.length - 1);

            BufferedWriter bw = new BufferedWriter(new FileWriter("twoDQuickSortOutput.txt"));
            for (int i = 0; i < arr.length; i++) {
                bw.write(arr[i][0] + " " + arr[i][1] + "\n");
            }
            bw.close();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}