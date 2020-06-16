/*
Problem: You are given an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n). 
You need to write a class called MyCalculator which implements the interface.
divisorSum function just takes an integer as input and return the sum of all its divisors.
 For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at most 1000.
Read the partially completed code in the editor and complete it. You just need to write the MyCalculator 
class only. Your class shouldn't be public.
 */
import java.util.*;

interface AdvancedArithmetic{
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic{

    public int divisor_sum(int n) {
        Scanner input=new Scanner(System.in);
        int j = 0;

        for(int i = 1; i <= n; i++) {
            if (n % i == 0) {
                j = j + i;
            }
        }
        return j;
    }
}

class Solution{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}