package creational.singleton.implementations;

public enum SimpleEnumBasedSingletonImplementation {
    INSTANCE;

    private String env = "Prod";

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }
}
