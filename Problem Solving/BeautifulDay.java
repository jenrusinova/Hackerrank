/*
https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int count = 0;
        for (int a = i; a <= j; a++) {
            if (Math.abs((a - reverse(a)) % k) == 0){
                count++;
            }
        }
        return count;
    }

    public static int reverse (int number){
        String str = Integer.toString(number);
        String reverse = new StringBuilder(str).reverse().toString();
        return Integer.parseInt(reverse);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}