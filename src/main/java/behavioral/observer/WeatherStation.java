package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable{

    private  List<Observer> observers;

    public WeatherStation(){
        observers = new ArrayList<>();
    }
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }
}
