/*
Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale
from 1 to 100 for three categories: problem clarity, originality, and difficulty.
The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the rating for Bob's challenge is the
triplet b = (b[0], b[1], b[2]).
The task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].

    If a[i] > b[i], then Alice is awarded 1 point.
    If a[i] < b[i], then Bob is awarded 1 point.
    If a[i] = b[i], then neither person receives a point.

Comparison points is the total points a person earned.
Given a and b, determine their respective comparison points.
Example

a = [1, 2, 3]
b = [3, 2, 1]

    For elements *0*, Bob is awarded a point because a[0] .
    For the equal elements a[1] and b[1], no points are earned.
    Finally, for elements 2, a[2] > b[2] so Alice receives a point.

The return array is [1, 1] with Alice's score first and Bob's second. 

Input Format

The first line contains 3 space-separated integers, a[0], a[1], and a[2], the respective values in triplet a.
The second line contains 3 space-separated integers, b[0], b[1], and b[2], the respective values in triplet b.

Constraints
    1 ≤ a[i] ≤ 100
    1 ≤ b[i] ≤ 100
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int AliceCount = 0;
        int BobCount = 0;

        for (int i =0; i <a.size(); i++) {

            if (a.get(i) > b.get(i))
                AliceCount++;
            else if(a.get(i) < b.get(i))
                BobCount++;
        }

        List<Integer> result = new ArrayList<>();
        result.add(AliceCount);
        result.add(BobCount);

        for (Integer i: result){
            System.out.println(i);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}