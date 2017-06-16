package weatherstationex;

/**
 * Created by Administrator on 2017/6/14.
 */
public interface Observer
{
    void update(float temperature, float humidity, float pressure);
}
