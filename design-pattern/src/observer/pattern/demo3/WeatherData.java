package observer.pattern.demo3;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer4> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer4 observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer4 observer) {
        observers.remove(observer);

        int index = observers.indexOf(observer);
        if( index > -1 ) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i=0;i<observers.size();i++) {
            Observer4 observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public float getTemperature() {
        return 0;
    }

    public float getHumidity() {
        return 0;
    }

    public float getPressure() {
        return 0;
    }

    public void measurementsChanged() {
        this.notifyObservers();
    }

    public void setMeasuredTemperature(float measurement, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        this.measurementsChanged();
    }

}
