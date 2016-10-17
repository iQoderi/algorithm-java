package sort;

/**
 * Created by qoder on 16-10-17.
 */
public class Sort {
    public void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public void insertSort(int[] arr, int n) {
        for (int i = 1; i < n; ++i) {
            int temp = arr[i];
            int j;
            for (j = i - 1; j >= 0 && temp < arr[j]; --j) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }

    public void bubbleSort(int[] arr, int n) {
        int flag = 1;
        if (arr == null || n == 0) {
            return;
        }
        for (int i = n - 1; i >= 1 && flag == 1; i--) {
            flag = 0;
            for (int j = 0; j < i; j++) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                if (flag == 0) {
                    flag = 1;
                }
            }
        }
    }

    public void selectSort(int[] arr, int n) {
        int min = 0;
        for (int i = 0; i < n; i++) {
            min = i;
            for (int j = i; j < n; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            swap(arr[i], arr[min]);
        }
    }

    public void quickSort(int[] arr, int left, int right) {
        int i, j, temp;
        if (left < right) {
            return;
        }

        temp = arr[left];
        i = left;
        j = right;

        while (i != j) {
            while (arr[j] >= temp && i < j) {
                j--;
            }

            while (arr[i] <= temp && i < j) {
                i++;
            }

            if (i < j) {
                swap(arr[i], arr[j]);
            }
        }

        //基数归位
        arr[left] = arr[i];
        arr[i] = temp;

        quickSort(arr, left, i - 1);
        quickSort(arr, i + 1, right);
    }
}


