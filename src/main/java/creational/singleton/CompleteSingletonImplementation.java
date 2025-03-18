package creational.singleton;

public class CompleteSingletonImplementation {
    private static volatile CompleteSingletonImplementation instance;
    private String data;

    private CompleteSingletonImplementation(String data){
        this.data = data;
    }

    public static final CompleteSingletonImplementation getInstance(String data){

        /**
         * Do you think of any problem here?
         * Most of us would say no, but there is a problem of accessing a partially created
         * object from the memory in the multithreaded scenario.
         *   ex: We have two threads A and B, Thread A acquires the lock and start creating
         *   the instance of CompleteSingletonImplementation class, and it has created the partial
         *   instance of CompleteSingletonImplementation, now Thread B comes into the picture and this
         *   time instance won't be null, so it will return the partially created instance.
         *
         * Solution: use of volatile keyword, which will read the value everytime from the memory.
         *
         * **/
        if(instance == null ) {
            synchronized (CompleteSingletonImplementation.class) {
                if (instance == null) {
                    instance = new CompleteSingletonImplementation(data);
                }
            }
        }
        return instance;
    }
}
