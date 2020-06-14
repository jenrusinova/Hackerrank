/*
Problem:
You must add a sing method to the Bird class, then modify the main method accordingly so that the code prints the following lines:
I am walking
I am flying
I am singing
 */

class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("I am flying");
    }
    void sing(){
        System.out.println("I am singing");
    }
}

public class Solution{

    public static void main(String args[]){
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}