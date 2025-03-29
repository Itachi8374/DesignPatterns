package Modules.observer;

import java.util.ArrayList;

public class WeatherData implements ISubject{
    WeatherState weatherState;

    ArrayList<IObserver> observers = new ArrayList<IObserver>();

    public WeatherData(WeatherState weatherState){
        this.weatherState = weatherState;
    }

    public boolean register(IObserver observer){
        observers.add(observer);
        return true;
    }

    public boolean unregister(IObserver observer) {
        observers.remove(observer);
        return false;
    }

    public void notifyObservers(){
        for(IObserver observer: observers){
            observer.update();
        }
    }

    public WeatherState getState(){
        return weatherState;
    }

    public void setState(WeatherState weatherState){
        this.weatherState = weatherState;
        notifyObservers();
    }
}
