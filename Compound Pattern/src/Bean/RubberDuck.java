package Bean;

import Interface.Quackable;

/**
 * Created by Administrator on 2017/7/14.
 */
public class RubberDuck implements Quackable
{
    public RubberDuck()
    {
        observable = new Observable(this);
    }

    @Override
    public void quack()
    {
        System.out.println("Squeak");
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
