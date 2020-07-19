/*
Task: You are in charge of the cake for your niece's birthday and have decided the cake will have one candle for each
year of her total age. When she blows out the candles, she’ll only be able to blow out the tallest ones. Your task
is to find out how many candles she can successfully blow out.
For example, if your niece is turning 4 years old, and the cake will have candles of height 4,4,1,3 she will be able
to blow out candles successfully, since the tallest candles are of height and there are such candles.

Input Format:
The first line contains a single integer, n , denoting the number of candles on the cake.
The second line contains n space-separated integers i, where each integer describes the height of candle i .

Constraints:
1 <= n < 10^5
1 <= ar[i] <=10^7

Output Format:
Return the number of candles that can be blown out on a new line.
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    static int birthdayCakeCandles(int[] ar) {
        int result = 0;
        int max = ar[0];

        for (int i = 0; i < ar.length; i++){
            if(ar[i] > max){
                max = ar[i];
            }
        }

        for (int i = 0; i < ar.length; i++){
            if (max == ar[i])
                result++;
        }

        System.out.println(result);
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}