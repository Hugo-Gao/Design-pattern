package Interface;


/**
 * Created by Administrator on 2017/7/14.
 */
public interface QuackObservable
{
     void registerObserver(Observer observer);

     void notifyObservers();
}
