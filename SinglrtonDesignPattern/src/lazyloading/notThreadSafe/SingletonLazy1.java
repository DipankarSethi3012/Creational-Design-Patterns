package lazyloading.notThreadSafe;

public class SingletonLazy1 {
    private static SingletonLazy1 instance;
    private SingletonLazy1(){}

    public static SingletonLazy1 getInstance() {
        if(instance == null) {
            instance = new SingletonLazy1();
        }

        return instance;
    }

}

//not-thread safe, requires synchronization in multithreaded environments
//saves memory as compared to the eager loading