/*Task
In this challenge, you must read integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.
Input Format 
There are 3 lines of input, and each line contains a single integer.*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while(sc.hasNextInt()){
            System.out.println(sc.nextInt());
        }
}

