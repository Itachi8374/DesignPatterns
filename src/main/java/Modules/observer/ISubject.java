package Modules.observer;

public interface ISubject {
    boolean register(IObserver observer);
    boolean unregister(IObserver observer);
    void notifyObservers();
    WeatherState getState();
}
