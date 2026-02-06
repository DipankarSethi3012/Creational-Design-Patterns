package lazyloading.threadsafe.production;

public class Main {
    public static void main(String[] args) {
        SingletonLazy instance = SingletonLazy.getInstance();
        System.out.println(instance);

        SingletonLazy instance1 = SingletonLazy.getInstance();
        System.out.println(instance1);

        if(instance == instance1) {
            System.out.println("Both the instances are equal");
        }
    }
}
