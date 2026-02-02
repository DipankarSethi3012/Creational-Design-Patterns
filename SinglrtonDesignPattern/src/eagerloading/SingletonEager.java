package eagerloading;

public class SingletonEager {
    private static final SingletonEager instance = new SingletonEager(); //private-static-final
    private SingletonEager() {} //private constructor

    public static SingletonEager getInstance() {
        return instance;
    }
}

//eager-loading is thread safe
//prons
//thread-safe, easy to implement
//extra-memory if this is never used
