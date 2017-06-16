package weatherstationex;

/**
 * Created by Administrator on 2017/6/14.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement
{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display()
    {
        System.out.println(toString());
    }

    @Override
    public String toString()
    {
        return "使用自建观察者模式"+"temperature=" + temperature + ", humidity=" + humidity ;
    }
}
