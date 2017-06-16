package weatherstationex;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/14.
 */
public class WeatherData implements Subject
{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData()
    {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer)
    {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers()
    {
        for (Observer observer : observers)
        {
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged()
    {
        notifyObservers();
    }

    public void setMeassuremenst(float temperature,float humidity,float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
