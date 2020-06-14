/*
Problem: given the string A, print Yes if it's a palindrome, print No otherwise. 
 */
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append(A);
        sb = sb.reverse();

        if (A.equals(sb.toString())){
            System.out.println("Yes");
        }
        else
            System.out.println("No");

    }
}