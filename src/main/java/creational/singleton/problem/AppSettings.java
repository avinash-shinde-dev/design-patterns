package creational.singleton.problem;

public class AppSettings {
    private String databaseUrl;
    private String env;

    public AppSettings(String databaseUrl, String env) {
        this.databaseUrl = databaseUrl;
        this.env = env;
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
        return "AppSettings{" +
                "databaseUrl='" + databaseUrl + '\'' +
                ", env='" + env + '\'' +
                '}';
    }
}
