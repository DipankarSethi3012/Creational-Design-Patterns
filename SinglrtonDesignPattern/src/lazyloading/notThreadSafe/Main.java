package lazyloading.notThreadSafe;

public class Main {
    public static void main(String[] args) {
        SingletonLazy1 instance = SingletonLazy1.getInstance();
        System.out.println(instance);

        SingletonLazy1 instance1  = SingletonLazy1.getInstance();
        System.out.println(instance1);

        if(instance1 == instance) {
            System.out.println("Both the instances point to same memory address");
        } else {
            System.out.println("Both the instances are different");
        }
    }
}
//Problem:
//If the two threads simultaneously call the getInstance() method, for the first time in the lazy-loading Singleton.
//If the instance hasn't been created yet, both threads pass the null check, end up creating the two different instances,
//breaking the singleton pattern
