import java.util.*;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        // Function to find sum of the digit
        // System.out.println(findSum(num));

        // Function to find the product
        System.out.println(findProd(num));
    }

    static int findSum(int num) {
        if (num == 0) {
            return num;
        }
        int rem = num % 10;
        num = num / 10;
        return rem + findSum(num);
    }

    static int findProd(int num) {
        if (num == 1) {
            return num;
        }
        int rem = num % 10;
        num = num / 10;
        return rem * findProd(num);
    }

}
