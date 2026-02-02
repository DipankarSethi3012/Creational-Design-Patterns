package lazyloading.threadsafe.better;

public class SingletonLazy {
    private static volatile SingletonLazy instance;

    private SingletonLazy(){}

    //the-approach is known as double-check locking
    public static SingletonLazy getInstance() {
        if(instance == null) {
            synchronized (SingletonLazy.class) {
                if(instance == null) {
                    instance = new SingletonLazy();
                }
            }
        }

        return instance;
    }
}
//volatile keyword ensures that changes made by one-thread are visible to others. Without volatile one thread might create the singleton instance
//but the other threads might not see the updated value due to caching.
//volatile ensures that the instance is always read from the main memory, so all-threads are most up-to date version

//pros:
//synchronization only happens once, when the instance is created.
//safe and fast in concurrent environments

//cons:
//Slightly more complex than synchronized method.
//Requires Java 1.5 or later because of the volatile keyword.