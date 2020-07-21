import java.util.ArrayList;
import java.util.Scanner;
/*In the main method, we populated an ArrayList with several instances of these classes.
Count method calculates how many instances of each type is present in the ArrayList.
The code prints three integers, the number of instance of Student class, the number of instance of Rockstar class,
the number of instance of Hacker class.
 */
class Student{}
class Rockstar{}
class Hacker{}


public class InstanceOFTutorial{

    static String count(ArrayList mylist){
        int a = 0,b = 0,c = 0;
        for(int i = 0; i < mylist.size(); i++){
            Object element=mylist.get(i);
            if(mylist.get(i) instanceof Student)
                a++;
            if(mylist.get(i) instanceof Rockstar)
                b++;
            if(mylist.get(i) instanceof Hacker)
                c++;
        }
        String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
        return ret;
    }

    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            String s=sc.next();
            if(s.equals("Student"))mylist.add(new Student());
            if(s.equals("Rockstar"))mylist.add(new Rockstar());
            if(s.equals("Hacker"))mylist.add(new Hacker());
        }
        System.out.println(count(mylist));
    }
}