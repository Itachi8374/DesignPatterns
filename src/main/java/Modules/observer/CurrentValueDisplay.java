package Modules.observer;

public class CurrentValueDisplay implements IDisplay, IObserver{
    private WeatherState currentState;
    private ISubject subject;

    public CurrentValueDisplay(ISubject subject){
        this.subject = subject;
        this.subject.register(this);
        this.currentState = subject.getState();
    }

    @Override
    public void display() {
        System.out.println("Current Value of temp, humidity, pressure:" + currentState.getTemperature() +" "+
                currentState.getHumidity() + " "+ currentState.getPressure());
    }

    @Override
    public void update() {
        this.currentState = subject.getState();
        display();
    }
}
