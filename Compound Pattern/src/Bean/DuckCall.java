package Bean;


import Interface.Observer;
import Interface.Quackable;

/**
 * Created by Administrator on 2017/7/14.
 */
public class DuckCall implements Quackable
{
    Observable observable;

    public DuckCall()
    {
        observable = new Observable(this);
    }

    @Override
    public void quack()
    {
        System.out.println("Kwak");
        notifyObservers();
    }
    public void registerObserver(Observer observer)
    {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers()
    {
        observable.notifyObservers();
    }
}
