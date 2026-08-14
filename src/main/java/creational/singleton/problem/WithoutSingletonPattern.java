package creational.singleton.problem;

public class WithoutSingletonPattern {
    public static void main(String[] args) {

        AppSettings config1 = new AppSettings("url", "Prod");
        AppSettings config2 = new AppSettings("url", "Prod");

        // for the same class you have the two objects, are these two objects
        // same ?

        System.out.println(config1 == config2);

        config2.setEnv("Dev");

        // Now for the same source, we have two copies

        System.out.println(config1);

        System.out.println(config2);

        // This is where singleton design pattern will help you.

    }
}
