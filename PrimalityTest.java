/*
Problem: given the large integer n, use the JAVA BigInteger class 'isProbablePrime' method to determine and print
whether it's prime or not prime.
Input format: a single line containing an integer n
Output: if n is a prime number , print prime, otherwise print not prime. 
*/
public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger n = scanner.nextBigInteger();
        scanner.close();
        System.out.println(n.isProbablePrime(100) ? "prime" : "not prime");
    }
}