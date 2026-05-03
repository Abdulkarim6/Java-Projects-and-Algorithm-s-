package compareTimeBTWBubbleAndMergeSort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class compareTimeBTWBubbleAndMergeSort {
    // Bubble Sort
    public static void BubbleSort(int[][] arr, int length) {
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j][0] > arr[j + 1][0] || arr[j][0] == arr[j + 1][0] && arr[j][1] > arr[j + 1][1]) {
                    int[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Merge Sort - Conquer
    public static void conquer(int[][] arr, int si, int mid, int ei) {
        int[][] merged = new int[ei - si + 1][2];
        int li = si;
        int ri = mid + 1;
        int x = 0;

        while (li <= mid && ri <= ei) {
            if (arr[li][0] < arr[ri][0] || (arr[li][0] == arr[ri][0] && arr[li][1] < arr[ri][1])) {
                merged[x++] = arr[li++];
            } else {
                merged[x++] = arr[ri++];
            }
        }

        while (li <= mid) {
            merged[x++] = arr[li++];
        }

        while (ri <= ei) {
            merged[x++] = arr[ri++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int[][] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = (si + ei) / 2;

        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("bubbleInput.txt"));
            String line = br.readLine();
            int length = Integer.parseInt(line);

            int[][] arrForBubble = new int[length][2];
            int[][] arrForMerge = new int[length][2];

            for (int i = 0; i < length; i++) {
                String[] paires = br.readLine().trim().split("\\s+");
                arrForBubble[i][0] = Integer.parseInt(paires[0]);
                arrForBubble[i][1] = Integer.parseInt(paires[1]);

                // একই ডেটা মার্জ সর্টের অ্যারেতেও কপি করে রাখছি
                arrForMerge[i][0] = arrForBubble[i][0];
                arrForMerge[i][1] = arrForBubble[i][1];
            }
            br.close();

            // ---------------- Bubble Sort ----------------
            long bsst = System.nanoTime();
            BubbleSort(arrForBubble, length);
            long bset = System.nanoTime();
            long bstt = (bset - bsst);

            // ---------------- Merge Sort ----------------
            long msst = System.nanoTime();
            divide(arrForMerge, 0, length - 1);
            long mset = System.nanoTime();
            long mstt = (mset - msst);

            // ---------------- ফাইল আউটপুট(arrForBubble) ----------------
            BufferedWriter bwb = new BufferedWriter(new FileWriter("bubbleOutput.txt"));
            for (int i = 0; i < length; i++) {
                bwb.write(arrForBubble[i][0] + " " + arrForBubble[i][1] + "\n");
            }
            bwb.write("Bubble Sort Time: " + bstt + " nanoseconds\n");
            bwb.close();

            // ---------------- ফাইল আউটপুট (arrForMerge)----------------
            BufferedWriter bwm = new BufferedWriter(new FileWriter("mergedOutput.txt"));
            for (int i = 0; i < length; i++) {
                bwm.write(arrForMerge[i][0] + " " + arrForMerge[i][1] + "\n");
            }
            bwm.write("Merge Sort Time:  " + mstt + " nanoseconds\n");
            bwm.close();

            // for (int i = 0; i < length; i++) {
            // System.out.println(arr[i][0] + " " + arr[i][1] + "\n");
            // }

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
