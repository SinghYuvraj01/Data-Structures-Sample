import java.util.*;

public class LinearSearch {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the values : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

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
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        // In case value not found
        return -1;
    }
}
