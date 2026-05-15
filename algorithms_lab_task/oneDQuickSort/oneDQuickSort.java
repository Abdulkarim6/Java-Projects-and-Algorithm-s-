package oneDQuickSort;

public class oneDQuickSort {
    public static void Swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int Partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                Swap(arr, i, j);
            }
        }

        i++;
        Swap(arr, i, high);
        return i;
    }

    public static void QuickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivotIndex = Partition(arr, low, high);
            QuickSort(arr, low, pivotIndex - 1);
            QuickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 2, 4, 6, 7, 3 };
        QuickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
