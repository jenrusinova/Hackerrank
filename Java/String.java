/*
Problem. Given two strings of lowercase English letters, A and B, perform the following operations:
1)Sum the length of A and B
2)Determine if A is lexicographically larger than B
3)Capitalize the first letter in A and B and print them on a single line, separated by a space
Input format. The first line contains a string A. The second line contains another string B.  The strings are comprised of only lowercase English letters.
Output format. 
1)For the first line, sum the lengths of A and B
2)For the second line write Yes if A is lexicographically greater than B otherwise print NO instead.
3)For the third line, capitalize the first letter in both A and B  and print them on a single line, separated by a space.
*/

import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int sum = A.length()+B.length();
        System.out.println(sum);

        int comp = A.compareTo(B);
        if (comp >0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

       String result = A.substring(0,1).toUpperCase() + A.substring(1,A.length()) +
       " " + B.substring(0,1).toUpperCase()                 + B.substring(1,B.length());
        
         System.out.println(result);
    }
}