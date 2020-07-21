/*
Task: Given a string s  and an integer k , complete the function so that it finds the lexicographically smallest
and largest substrings of length k.
Input format: The first line contains a string denoting s.
The second line contains an integer denoting k.
Constraints:
1 <= s <= 1000
s consists of English alphabetic letters only
Return the respective lexicographically smallest and largest substrings as a single newline-separated string.
Sample Input 
welcometojava
3
Sample Output
ava
wel
 */

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        int n = s.length();
        java.util.ArrayList<String> array = new java.util.ArrayList<>();

        for (int i = 0; i <= n - k; i++){
            String sub = s.substring(i, i + k);
            array.add(sub);
        }
        java.util.Collections.sort(array);

        smallest = array.get(0);
        largest = array.get(array.size()-1);

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}