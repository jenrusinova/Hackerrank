/*
Task: Calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite
large.

Input Format: The first line of the input consists of an integer n. The next line contains space-separated n integers
contained in the array.

Output Format: Print the integer sum of the elements in the array.

Constraints:
1 <= n <=10
0 <= ar[i] <=10^10
 */


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {


    static long aVeryBigSum(long[] ar) {

        long sum=0;
        for (long l: ar){
            sum+=l;
        }
        return sum;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] ar = new long[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            long arItem = Long.parseLong(arItems[i]);
            ar[i] = arItem;
        }

        long result = aVeryBigSum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}