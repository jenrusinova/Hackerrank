/*
Task: Complete the miniMaxSum function in the editor below. It should print two space-separated integers on one line:
the minimum sum and the maximum sum of 4 of 5 elements.
miniMaxSum has the following parameter(s):
    arr: an array of 5 integers

Input Format:
A single line of five space-separated integers.

Constraints:
1 <= arr[i] <= 10^9

Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by
summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)
 */

import java.util.Scanner;

public class Solution {

    static void miniMaxSum(int[] arr) {
        long sum = 0;
        int min = arr[0];
        int minIndex = 0;

        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++){
            sum+=arr[i];
            if (min>arr[i]){
                min = arr[i];
                minIndex = i;
            }
            if (max<arr[i]){
                max= arr[i];
                maxIndex = i;
            }
        }
        System.out.print((sum - arr[maxIndex]) + " " + (sum - arr[minIndex]));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        miniMaxSum(arr);
        scanner.close();
    }
}