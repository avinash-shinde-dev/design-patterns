package creational.singleton;

public class ThreadSafeSingletonImplementation {
    private static ThreadSafeSingletonImplementation instance;
    private String data;

    private ThreadSafeSingletonImplementation(String data){
        this.data = data;
    }

    public static final ThreadSafeSingletonImplementation getInstance(String data){

        /**
         * synchronized block will make sure that it will allow only one thread to access
           the code inside the block. Do you think if we are adding any kind of overhead over here?
         *  ** Problem:
         *  Even though the instance is created thread will have to wait until it acquire
         * the lock to access the shared resource.
         *  ** Solution
         *    We can solve this problem by double-checked locking idiom mechanism.
         * {@code DoubleCheckingLockSingletonImplementation }
         **/
        synchronized (ThreadSafeSingletonImplementation.class) {
            if (instance == null) {
                instance = new ThreadSafeSingletonImplementation(data);
            }
        }
        return instance;
    }
}
