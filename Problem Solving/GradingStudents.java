/*
Task:
Complete the function gradingStudents in the editor below. It should return an integer array consisting of rounded
grades.gradingStudents has the following parameter(s):

    grades: an array of integers representing grades before rounding
Rules of rounding: If the difference between the grade and the next multiple of 5 is less than 3, round grade up to
the next multiple of 5. If the value of grade is less than 38, no rounding occurs as the result will still be a
failing grade.

Constraints:
1 < n <= 60
0 <= grades[i] <= 100;

Output Format: For each grades[i] print the rounded grade on a new line.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Result {
    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        for(int i = 0; i < grades.size();i++){
            if(grades.get(i)>= 38){
               
                int diff = Math.abs( grades.get(i)%5 - 5);
                if( diff < 3)
                    grades.set(i,grades.get(i)+diff);
            }
        }
        return grades;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < gradesCount; i++) {
            int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
            grades.add(gradesItem);
        }

        List<Integer> result = Result.gradingStudents(grades);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}