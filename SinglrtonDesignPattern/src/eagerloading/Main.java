package eagerloading;

public class Main {
    public static void main(String[] args) {
        SingletonEager instance = SingletonEager.getInstance();
        System.out.println(instance);

        SingletonEager instance1 = SingletonEager.getInstance();
        System.out.println(instance1);

        if(instance == instance1) { //thhis-statement runs as we get a single instance and both instance belongs to the same memory address
            System.out.println("Both the instances are equal");
        } else {
            System.out.println("Different instances");
        }
    }
}
