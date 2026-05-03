package merge_Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class merge_Sort {
    public static void conquer(int[][] arr, int si, int mid, int ei) {
        int[][] merged = new int[ei - si + 1][2];
        int l = si;
        int r = mid + 1;
        int x = 0;

        while (l <= mid && r <= ei) {
            if (arr[l][0] < arr[r][0] || arr[l][0] == arr[r][0] && arr[l][1] <= arr[r][1]) {
                merged[x++] = arr[l++];
            } else {
                merged[x++] = arr[r++];
            }
        }
        ;

        while (l <= mid) {
            merged[x++] = arr[l++];
        }
        ;

        while (r <= ei) {
            merged[x++] = arr[r++];
        }
        ;

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
        ;
    };

    public static void divide(int[][] arr, int si, int ei) {
        if (si >= ei)
            return;

        int mid = (si + ei) / 2;

        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    };

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("inputPaires.txt"));
            String line = br.readLine().trim();
            int length = Integer.parseInt(line);
            int[][] arr = new int[length][2];

            for (int i = 0; i < arr.length; i++) {
                String[] paire = br.readLine().trim().split("\\s++");
                arr[i][0] = Integer.parseInt(paire[0]);
                arr[i][1] = Integer.parseInt(paire[1]);
            }
            br.close();

            divide(arr, 0, length - 1);

            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            for (int i = 0; i < length; i++) {
                writer.write(arr[i][0] + " " + arr[i][1] + "\n");
            }

            writer.close();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
