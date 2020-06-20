/*
Complete the Singleton class in your editor which contains the following components:
1)A private Singleton non parameterized constructor.
2)A public String instance variable named str
3)Write a static method named getSingleInstance that returns the single instance of the Singleton class.
 */
class Singleton{
    private static Singleton INSTANCE;
    public  String str;

    private Singleton(){
    }

    public static Singleton getSingleInstance(){
        if (INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}