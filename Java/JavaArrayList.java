/*
Task: You are given lines. In each line there are zero or more integers. You need to answer a few queries where you
need to tell the number located in xth position of yth line.
Take your input from System.in.

Input Format: The first line has an integer n. In each of the next n lines there will be an integer d denoting number
of integers on that line and then there will be d  space-separated integers. In the next line there will be an integer
q denoting number of queries. Each query will consist of two integers x and y.

Constraints:
1 <= n <= 20000
0 <= d <= 50000
1 <= q <= 1000
1 <= x <= n
Each number will fit in signed integer.
Total number of integers in n lines will not cross 10^5

Output format:
In each line, output the number located in xth position of yth line. If there is no such position, just print "ERROR!"
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberofArrays = sc.nextInt();

        ArrayList<ArrayList<Integer>> arrays = new ArrayList<>();

        for (int i = 0; i < numberofArrays; i++){
            int input = sc.nextInt();
            ArrayList<Integer> array = new ArrayList<>();
            for (int j = 0; j < input; j++){
                array.add(sc.nextInt());
            }
            arrays.add(array);
        }
        int query = sc.nextInt();
        for (int i = 0; i < query; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            try{
                System.out.println(arrays.get(x-1).get(y-1));
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}