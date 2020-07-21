/*
You will be given two integers, x and y as input,  you have to compute x/y. If x and y are not
32 bit signed integers or if yis zero, exception will occur and you have to report it. 
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int c;

        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            c = a/b;
            System.out.println(c);
        }
        catch(InputMismatchException i){
            System.out.println("java.util.InputMismatchException");
        }
        catch(ArithmeticException ar){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}