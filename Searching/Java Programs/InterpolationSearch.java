import java.util.*;

public class InterpolationSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 4, 6, 8, 10, 12, 15 };
        int target;
        System.out.print("Enter the target value : ");
        target = sc.nextInt();

        // Call the function to find the value
        int ans = find(arr, target);
        if (ans == -1) {
            System.out.println("Value not found !!");
        } else {
            System.out.println("Value found at : " + ans);
        }
    }

    static int find(int[] arr, int target) {
        // First let us define the search space
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int pos = end + (start - end) * ((target - arr[end]) / (arr[start] - arr[end]));

            if (target < arr[pos]) {
                end = pos - 1;
            } else if (target > arr[pos]) {
                start = pos + 1;
            } else if (target == arr[pos]) {
                return pos;
            }
        }

        // If value not found
        return -1;
    }

}
