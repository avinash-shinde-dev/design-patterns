package behavioral.observer;

public class WeatherData implements Data{
    private Double temp;
    private Double humidity;

    public WeatherData(Double temp, Double humidity) {
        this.temp = temp;
        this.humidity = humidity;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    @Override
    public String get() {
        return "Current temperature is: "+ getTemp() + " and humidity: " + getHumidity();
    }
}
