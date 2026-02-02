package lazyloading.threadsafe.good;

public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton(){}

    public static synchronized LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }

        return instance;
    }
}

//the synchronized keyword ensures that only one thread at a time can execute the getInstance() method.
//This prevents multiple threads entering into the method simultaneously and creating multiple instances.

//Pros:
//Simple and thread-safe to implement
//thread-safe without needing complex logic

//Cons:
//Performance overhead: Every call to the getInstance() method is synchronized, even after the instance is created
//May slow down the application in high-concurrency scenarios.