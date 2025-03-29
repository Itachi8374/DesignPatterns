package Modules.observer;


/*
* Weather data object which sends - temperature, humidity and pressure
* Application to provide 3 display elements - current conditions, statistics and forecast
* Updates in real time
* Other developers to add new display elements
* */
public class WeatherORama {
    public static void main(String[] args) {
        WeatherState weatherState = new WeatherState(10, 20, 30);
        WeatherData weatherData = new WeatherData(weatherState);

        CurrentValueDisplay currentValueDisplay = new CurrentValueDisplay(weatherData);
        weatherData.setState(new WeatherState(20, 30, 40));
        weatherData.setState(new WeatherState(30, 40, 50));
    }
}
