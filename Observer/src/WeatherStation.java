/**
 * Created by Administrator on 2017/6/14.
 */
public class WeatherStation
{
    public static void main(String[] args)
    {
        WeatherData weatherData = new WeatherData();
        Observer observer1 = new CurrentConditionDisplay(weatherData);
        Observer observer2 = new CurrentConditionDisplay(weatherData);
        Observer observer3 = new CurrentConditionDisplay(weatherData);
        weatherData.setMeassuremenst(350f, 52f, 32f);

        WeatherDataObservable weatherDataObservable = new WeatherDataObservable();
        java.util.Observer observer = new GeneralDisplay(weatherDataObservable);
        weatherDataObservable.setMeasurements(10f,20f,60f);
    }
}
