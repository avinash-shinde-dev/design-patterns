package creational.singleton;

/**
 * This code will work perfectly in the single threaded environment, but it will start failing if
 * two threads starts to access the shared variable at the same time.
 * To solve this issue? Refer: {@code MultithreadedSingletonImplementation}
 */

/**
 * @author avshinde
 */
public class SimpleSingletonImplementation {

    private static SimpleSingletonImplementation instance;
    private String data;

    private SimpleSingletonImplementation(String data){
        this.data = data;
    }

    public static final SimpleSingletonImplementation getInstance(String data){
        if(instance == null){
            instance = new SimpleSingletonImplementation(data);
        }
        return instance;
    }


}
