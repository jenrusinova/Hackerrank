/*
Problem: given a string s and two indices, start and end, print a substring consisting of all characters in the
inclusive range from start to end-1.
Input format: the first line contains a single string s.
Output format: print the substring in the inclusive range from start to end-1.
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        String result = S.substring(start, end);
        System.out.println(result);
    }
}