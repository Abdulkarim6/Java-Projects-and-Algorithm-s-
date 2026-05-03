package quick_Sort;

// package quick_Sort;

public class Quick_Sort {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        i++;
        swap(arr, i, high);
        return i;
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 4, 3, 11, 15, 20, 22, 24, 30, 9, 1 };

        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }

    }
}