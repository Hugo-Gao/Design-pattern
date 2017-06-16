package weatherstationex;

import java.util.Observable;

/**
 * Created by Administrator on 2017/6/14.
 */
public class GeneralDisplay implements java.util.Observer
{
    private float temperature;
    private float humidity;
    private Observable observable;

    public GeneralDisplay(Observable observable)
    {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg)
    {
        if (o instanceof WeatherDataObservable)
        {
            WeatherDataObservable observable = (WeatherDataObservable) o;
            this.temperature = observable.getTemperature();
            this.humidity = observable.getHumidity();
            display();
        }
    }

    private void display()
    {
        System.out.println(toString());
    }


    @Override
    public String toString()
    {
        return "使用Java自带的SDK观察者模式"+"temperature=" + temperature + ", humidity=" + humidity ;
    }
}
