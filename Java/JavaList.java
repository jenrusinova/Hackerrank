/*
For this problem, we have 2 types of queries you can perform on a List: Insert at index
Insert
x y
Delete the element at index
Delete
x
Given a list, L , N of integers, perform Q queries on the list. Once all queries are completed, print the modified list
as a single line of space-separated integers.

Input Format:
The first line contains an integer, N (the initial number of elements in L).
The second line contains N space-separated integers describing L.
The third line contains an integer Q (the number of queries).
The 2Q subsequent lines describe the queries, and each query is described over two lines:
    If the first line of a query contains the String Insert, then the second line contains two space separated integers
    x y ,and the value y must be inserted into L at index x.
    If the first line of a query contains the String Delete, then the second line contains index x, whose element must
    be deleted from L.

Constraints:
1 <= N <= 4000
1 <= Q <= 4000

Output Format:
Print the updated list L as a single line of space-separated integers.
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> numbers = new LinkedList();

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        int numberOfQueries = sc.nextInt();
        for (int i = 0; i < numberOfQueries; i++) {
            String command = sc.next();
            if (command.equals("Insert")) {
                int index = sc.nextInt();
                int element = sc.nextInt();
                numbers.add(index, element);
            } else {
                int element = sc.nextInt();
                numbers.remove(element);
            }
        }
            sc.close();

            for (Integer j : numbers) {
                System.out.print(j + " ");
            }
        }
    }