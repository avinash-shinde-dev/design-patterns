package behavioral.observer;

public class ObserverDesignPattern {
    public static void main(String[] args) {
        // Observer design pattern
        // Walmart question -> Amazon product -> Notify Me functionality implementation

        /**
         *  Observer design pattern is particularly use when you want to establish the one-to-many relationship b/w
         *  objects. This allows an object (Observable) to notify the other objects (Observers) when there is a
         *  state change.
         *  It is widely use in event-driven programming.

         *  Why to use Observer pattern
         *   1. Decoupling -> decouples the observable (subject) from its observers. Observable doesn't need to know
         *     who or how many observers there are.
         *   2. Event handling -> whenever there is state change, all the dependent observers are notified automatically.
         *   3. Dynamic relationships -> New observer can be added or removed at runtime without affecting the observable.

         *  How does it work ?
         *  1. Observable (Subject) -> hold the state and notifies the observers.
         *  2. Observer -> object that listen for state change in the observable.
         *  3. ConcreteObservable -> implement Observable interface
         *  4. ConcreteObserver -> implements Observer interface and response to subject change.

         *  Application -
         *   Weather app
         *    - weather station collects the data such as temp and humidity
         *    - multiple display to automatically update the data
         *
         *  Advantage :
         *    - Loose coupling
         *    - Open/Close principle
         *    - Scalability
         *
         *  DisAdvantage :
         *    - Memory leaks - if observer is not removed properly, memory leaks
         *       can occur, as the observable holds the reference to them.
         *    - Overhead - notifying all the observers, may cause performance overhead.
         *    - unpredictable updates - updates in unpredictable order, can cause the issue
         *           if the order is important.
         *
         *   When to use:
         *    - real time data feeds -> stock, live score
         *    - messaging system
         *    - event listeners.
         */

         WeatherStation station = new WeatherStation();

         station.addObserver(new WeatherDisplay(new WeatherData(25.5, 60.4)));
         station.addObserver(new WeatherDisplay(new WeatherData(28.2, 39.7)));

         station.notifyObservers();
    }
}
