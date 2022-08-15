package Classes;

import java.util.Scanner;

public class uni {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter any 5 digit number");
            int num = sc.nextInt();

            // We will store the number as after taking the first and last digit the number
            // would be finsihed so we will have to agian retrieve the number
            int temp = num;

            // now we will take the last digit and then store it in last variable
            int last = num % 10;

            // now we will take the first digit of the number
            while (num > 10) // here we will run the loop untill we don't get the number in single digit
            {
                num = num / 10;
            }
            int first = num; // here we have got the first digit of hte number

            // now we will find the middle element of the number so we will first remove the
            // last digit of the number and then run the loop and store the middle element
            // in single variable
            temp = temp / 10;

            int rev = 0;
            while (temp > 10) // means greater than the first digit
            {
                rev = rev * 10 + temp % 10; // for taking the last digit and storing it in rev varible
                temp = temp / 10; // here we are updating the loop
            }

            // in the reverse the middle digits are in reverse so we will again reverse them
            // so that we can add them in the final number
            int middle = 0;
            while (rev != 0) {
                middle = middle * 10 + rev % 10;

                rev = rev / 10; // updation of the loop
            }

            int swap = (last * 10000) + middle;
            swap = swap + first;
            System.out.println("The digit after swapping is " + swap);

        }

    }

}
