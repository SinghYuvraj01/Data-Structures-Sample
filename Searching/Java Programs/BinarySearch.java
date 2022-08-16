import java.util.*;

public class BinarySearch {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        System.out.print("Enter the target value : ");
        int target = sc.nextInt();

        // Call function to find the value
        int ans = find(arr, target);
        if (ans == -1) {
            System.out.println("Valut not found");
        } else {
            System.out.println("Value present at : " + ans);
        }

    }

    static int find(int[] arr, int target) {

        // First let's define the search space
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target == arr[middle]) {
                return middle;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            }
        }
        // In case value not found
        return -1;
    }
}
