import java.util.Observable;

/**
 * Created by Administrator on 2017/6/14.
 */
public class WeatherDataObservable extends Observable
{
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDataObservable()
    {

    }
    public void setMeasurements( float temperature,  float humidity,  float pressure)
    {
        this.temperature = temperature;
        this.humidity=humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private void measurementsChanged()
    {
        setChanged();
        notifyObservers();
    }

    public float getTemperature()
    {
        return temperature;
    }

    public float getHumidity()
    {
        return humidity;
    }

    public float getPressure()
    {
        return pressure;
    }
}
