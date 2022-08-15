
// Importing java util package 
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) throws Exception {

        // Create an object of the scanner class to take input from user
        Scanner sc = new Scanner(System.in);

        int[] arr = { 6, 7, 3, 2, 1, 4, 5 };

        // Calling the function to sort the array
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Sort(int[] arr) {

        // Outer loop will be for selecting the current index
        for (int i = 0; i < arr.length - 1;) {

            int correct_index = arr[i] - 1;
            if (arr[correct_index] != arr[i]) {
                int swap = arr[correct_index];
                arr[correct_index] = arr[i];
                arr[i] = swap;
            } else {
                i++;
            }
        }

    }
}
