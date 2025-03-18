package creational.singleton;

public class DoubleCheckedLockingSingletonImplementation {
    private static DoubleCheckedLockingSingletonImplementation instance;
    private String data;

    private DoubleCheckedLockingSingletonImplementation(String data){
        this.data = data;
    }

    public static final DoubleCheckedLockingSingletonImplementation getInstance(String data){

        /**
         *  We are solving the problem by limiting the synchronization to the rare
         *  scenarios where we wanted to create the new instance.
         *  The most common cases of retrieving the instance will be avoided by skipping
         *  synchronization which will reduce the significant wait time.
         * **/
        if(instance == null ) {
            synchronized (DoubleCheckedLockingSingletonImplementation.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingletonImplementation(data);
                }
            }
        }
        return instance;
    }
}
