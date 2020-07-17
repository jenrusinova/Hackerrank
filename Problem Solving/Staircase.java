/*
Complete the staircase function in the editor below. It should print a staircase as described above.
- staircase has the following parameter(s): n: an integer.
Input Format:
A single integer, n, denoting the size of the staircase.
Constraints
0 <= n <=100
Output Format
Print a staircase of size n  using # symbols and spaces.
 */

import java.util.Scanner;

public class Solution {


    static void staircase(int n) {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if((i+j)>n)                {
                    System.out.print("#");                }
                else                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}