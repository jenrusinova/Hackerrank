/*
Task: 
Given an array of integers, find the sum of its elements.

Input Format:
The first line contains an integer n denoting the size of the array.
The second line contains n space-separated integers representing the array's elements.

Constraints:
0 < n, ar[i] <= 1000

Output Format:
Print the sum of the array's elements as a single integer. 
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

        static int simpleArraySum(int[] ar) {
        int result = 0;
        for (int i = 0; i < ar.length; i++){
            result +=ar[i];
        }
        System.out.println(result);
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}