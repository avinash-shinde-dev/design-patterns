package creational.singleton.solution;

public class SingletonPattern {
    public static void main(String[] args) {

        AppSettingSingleton config1  = AppSettingSingleton.getInstance();
        AppSettingSingleton config2  = AppSettingSingleton.getInstance();

        // now both the objects are same
        System.out.println(config1 == config2);


        // Even though, you change the data using setter methods, it will update
        // the values of fields in the same making it as single source of truth, but the current
        // implementation is not thread-safe implementation
        // Refer: Implementations package for more variation

        config1.setEnv("Dev");

        System.out.println(config1 == config2);
        System.out.println(config1);
        System.out.println(config2);

    }
}
