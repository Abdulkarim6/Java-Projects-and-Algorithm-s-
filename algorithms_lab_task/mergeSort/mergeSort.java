package mergeSort;

public class mergeSort {
    public static void conquer(int[] arr, int si, int mid, int ei) {
        int[] merged = new int[ei - si + 1];
        int l = si;
        int r = mid + 1;
        int x = 0;

        while (l <= mid && r <= ei) {
            if (arr[l] <= arr[r]) {
                merged[x++] = arr[l++];
            } else {
                merged[x++] = arr[r++];
            }
        }

        while (l <= mid) {
            merged[x++] = arr[l++];
        }
        while (r <= ei) {
            merged[x++] = arr[r++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        ;

        int mid = (si + ei) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 2, 3, 9 };
        int size = arr.length;

        divide(arr, 0, size - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
