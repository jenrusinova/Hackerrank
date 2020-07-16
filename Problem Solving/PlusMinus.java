/*
Task: Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate
line with n digits after the decimal. The function should not return a value.

Input format:
The first line contains an integer n , the size of the array.
The second line contains n space-separated integers that describe arr[n] .

Constraints
0 < n < 100
-100 <=arr[n] <=100

Output Format:
Print the following 3 lines, each to 6 decimals:
    proportion of positive values
    proportion of negative values
    proportion of zeros
 */
import java.util.Scanner;

public class Solution {
    
    static void plusMinus(int[] arr) {
        int count = arr.length;
        double positive = 0;
        double negative = 0;
        double zero = 0;

        for(int i = 0; i < arr.length; i++){
            if (arr[i] >0){
                positive++;}
            else if (arr[i] <0){
                negative++;}
            else
                zero++;
        }
        double pos = positive /count;
        double neg = negative/count;
        double z = zero/count;
        System.out.printf("%.6f %n", pos);
        System.out.printf("%.6f %n",neg);
        System.out.printf("%.6f %n",z);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        plusMinus(arr);
        scanner.close();
    }
}