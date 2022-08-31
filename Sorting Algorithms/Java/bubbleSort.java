import java.util.*;

public class bubbleSort {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };
        int size = arr.length;

        // Outer loop for the passes
        for (int i = 0; i < size - 1; i++) {
            int flag = 0;
            // Inner loop for sorting
            for (int j = 1; j < size - i; j++) {
                if (arr[j] > arr[j - 1]) {
                    flag++;
                    int swap = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = swap;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        System.out.println("Array after sorting : ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}