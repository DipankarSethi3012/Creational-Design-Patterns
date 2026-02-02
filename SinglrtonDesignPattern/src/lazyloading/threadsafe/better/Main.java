package lazyloading.threadsafe.better;

public class Main {
    public static void main(String[] args) {
        SingletonLazy instance = SingletonLazy.getInstance();
        System.out.println(instance);

        SingletonLazy instance1 = SingletonLazy.getInstance();
        System.out.println(instance1);

        if(instance == instance1) {
            System.out.println("Both the instances point to the same memory threads");
        } else {
            System.out.println("Both the instances are not equal");
        }
    }
}
