
import java.util.*;

public class PrintNumbers {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        // Function to compute sum of the number from Num to 1
        // System.out.println(findSum(num));

        // Function to compute product of number from Num to 1
        System.out.println(findProd(num));
    }

    static int findSum(int num) {

        if (num == 1) {
            return num;
        }

        return num + findSum(num - 1);
    }

    static int findProd(int num) {
        if (num == 1) {
            return num;
        }
        return num * findProd(num - 1);
    }

}
