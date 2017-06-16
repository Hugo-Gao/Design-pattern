package bookstoreex;

/**
 * Created by Administrator on 2017/6/16.
 */
public interface Observable
{
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
