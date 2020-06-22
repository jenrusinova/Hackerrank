/*
Input Format. The first line contains an integer q, denouting the number of quieries.
Each line i of the q subsequent lines contains three space-separated integers describing the respective a(i),b(i) and n(i)values for that query. 
Constraints:
0 <= q <= 500
0 <=a,b <=50
1 <=n <= 15
Output Format. For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.
*/

import java.util.Scanner;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int result = 0;

            for (int j =0; j < n; j++){
                result = (int)Math.pow(2,j)* b + result;
                System.out.print(a + result + " ");             
            }
            System.out.println("");
        }
        in.close();
    }
}