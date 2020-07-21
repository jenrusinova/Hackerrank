/*
Task: You are given a class Solution with a main method. Complete the given code so that it outputs the area of
a parallelogram with breadth B and height H . You should read the variables from the standard input.
If B <=0 or H <=0 he output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
Input format: There are two lines of input. The first line contains : B -  the breadth of the parallelogram.
The next line contains : H - the height of the parallelogram.
Constraints:
-100 <= B <=100
-100 <= H <=100
Output format: If both values are greater than zero, then the main method must output the area of the parallelogram. 
Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
 */
import java.util.Scanner;

public class Solution {
    static boolean flag;
    static Scanner sc = new Scanner(System.in);
    static int B = sc.nextInt();
    static int H = sc.nextInt();
    static{
        if (B >0 && H > 0){
            flag = true;
        }
        else
            System.out.print("java.lang.Exception: Breadth and height must be positive");
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}