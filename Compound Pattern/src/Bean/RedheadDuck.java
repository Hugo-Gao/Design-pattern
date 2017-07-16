package Bean;

import Interface.Quackable;

/**
 * Created by Administrator on 2017/7/14.
 */
public class RedheadDuck implements Quackable
{
    public RedheadDuck()
    {
        observable = new Observable(this);
    }

    @Override
    public void quack()
    {
        System.out.println("Quack");
        notifyObservers();
    }
    Observable observable;


    public void registerObserver(Interface.Observer observer)
    {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers()
    {
        observable.notifyObservers();
    }
}
