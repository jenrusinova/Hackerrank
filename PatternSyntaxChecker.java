/*
Task:In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.
Input format: The first line of input contains an integer N , denoting the number of test cases. The next N lines contain a string of any printable characters representing the pattern of a regex.
Output format:For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid. Do not print the quotes.
*/

import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	//Write your code
              testCases--;
              try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch (IllegalArgumentException e){
                System.out.println("Invalid");
            }
                  
		}
	}
}