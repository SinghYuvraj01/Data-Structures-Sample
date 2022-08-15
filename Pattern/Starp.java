// package Pattern;

// import java.util.Scanner;

// public class Starp {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int T = sc.nextInt();
// for (int i = 0; i < T; i++) {

// int G = sc.nextInt(); // row of 2d matrix
// int B = sc.nextInt(); // column of 2d matrix
// int[][] arr = new int[G][B];

// for (int group = 0; group < G; group++) {
// for (int team = 0; team < T; team++) {
// arr[group][team] = sc.nextInt();
// }
// }

// // use bubble sort to sort the array in ascending order
// // after sorting the team with highiest score will come at the end
// // only one pass required as after every pass highiest value comes at end

// for (int g = 0; g < arr.length; g++) {
// for (int t = 1; t < arr.length - g; t++) {
// if (arr[g][t] < arr[g][t - 1]) {
// int temp;
// temp = arr[g][t];
// arr[g][t] = arr[g][t - 1];
// arr[g][t - 1] = temp;
// }
// }
// }

// // now print the max value of every group mean for every row print the last
// // column
// for (int g = 0; g < arr.length; g++) {
// for (int t = 0; t < arr.length; t++) {
// System.out.println(arr[g][arr.length - 1]);
// }

// }

// }

// }

// }
