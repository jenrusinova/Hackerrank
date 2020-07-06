/*
Task: you are given a phone book that consists of people's names and their phone number. After that you will be given
some person's name as query. For each query, print the phone number of that person.

Input format: The first line will have an integer n denoting the number of entries in the phone book.
 Each entry consists of two lines: a name and the corresponding phone number.
After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.

Constraints:
A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name'
or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.
1 < n < 10^5
1 < Query < 10^5

Output format:
For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name 
and phone number
 */
import java.util.HashMap;
import java.util.Scanner;

class Solution{
    public static void main(String []argh)
    {   Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        HashMap<String,Integer> data = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            data.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            
            try {
                int temp = data.get(s);
                System.out.println(s + "=" + temp);
            } catch (NullPointerException e) {
                System.out.println("Not found");
            }
        }
            in.close();
        }
    }