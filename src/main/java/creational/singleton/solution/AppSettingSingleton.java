package creational.singleton.solution;

public class AppSettingSingleton {
    private static AppSettingSingleton instance;
    private String databaseUrl;
    private String env;

    private AppSettingSingleton(){
        databaseUrl = "jdbc-url";
        env = "Prod";

    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    @Override
    public String toString() {
        return "AppSettingSingleton{" +
                "databaseUrl='" + databaseUrl + '\'' +
                ", env='" + env + '\'' +
                '}';
    }

    public static AppSettingSingleton getInstance() {
        if(instance == null){
            instance = new AppSettingSingleton();
        }
        return instance;
    }
}
