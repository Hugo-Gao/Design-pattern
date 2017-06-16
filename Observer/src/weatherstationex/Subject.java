package weatherstationex;

/**
 * Created by Administrator on 2017/6/14.
 */
public interface Subject
{
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
