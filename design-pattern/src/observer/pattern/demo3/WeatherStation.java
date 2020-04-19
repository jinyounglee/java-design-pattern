package observer.pattern.demo3;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);


        currentConditionsDisplay.update(100, 200, 300);
        currentConditionsDisplay.update(200, 300, 300);
    }
}
