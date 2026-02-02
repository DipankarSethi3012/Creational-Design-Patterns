package lazyloading.threadsafe.production;

public class SingletonLazy {

    private SingletonLazy() {}

    private static class Holder {
        private static final  SingletonLazy instance = new SingletonLazy();
    }

    public static SingletonLazy getInstance() {
        return Holder.instance;
    }
}
//This is known as Bill-Pugh-Singleton, (Mostly Used in production)

//singleton-instance is not created until the get-instance is called
//The static inner class is not loaded until referenced
//It ensures thread-safety, lazy loading and high-performance without the synchronized methods.

//Pros:
//Best use for lazy and thread-safe
//no need for synchronized and volatile
//clean and efficient
