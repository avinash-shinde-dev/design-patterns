package behavioral.observer;

public class WeatherDisplay implements Observer{
    Data data;
    public WeatherDisplay(Data data){
        this.data = data;
    }
    @Override
    public void update() {
        System.out.println("Display ::: " + data.get());
    }
}
