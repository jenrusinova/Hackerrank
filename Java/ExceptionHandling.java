/*
Problem: You are required to compute the power of a number by implementing a calculator.
 Create a class MyCalculator which consists of a single method long power (int, int).  This method takes two integers,
 n and p as parameters and finds n^p.  If either n or p is negative, then the method must throw an exception
 which says "n or p should not be negative". Also if both n and p are zero, then the method must throw an exception
 which says "n and p should not be zero".
 Input format: Each line of the input contains two integers, n and p.
 Output format: Each line of the output contains the result n^p if both n and p are positive. If either n or p are
 negative, the output contains "n or p should not be negative". If both n and p are zero, the output contains
 "n and p should not be zero."
 */

import java.util.Scanner;

class MyCalculator {
    public long power (int n, int p) throws Exception{
        if ((n<0)||(p<0)){
            throw new Exception("n or p should not be negative.");
        }
        else if(n==0 && p==0){
            throw new Exception("n and p should not be zero.");
        }
        else{
            return(long)Math.pow(n,p);
        }
    }
}

public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}