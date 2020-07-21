/*
Task: Given an integer N, print its first multiples.
Constraints: 2<=N<=20.
Output format: Print 10 lines of output in the form: N x i = result.
 */
import java.util.Scanner;

public class Solutions {

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int N = scanner.nextInt();
               for (int i = 1; i <=10; i++){
                System.out.println(N + " x " + i + " = " + N*i);
            }
            scanner.close();
        }
}