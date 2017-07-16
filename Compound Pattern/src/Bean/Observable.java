package Bean;

import java.util.ArrayList;
import java.util.Iterator;

import Interface.QuackObservable;
import Interface.Observer;

/**
 * Created by Administrator on 2017/7/14.
 */
public class Observable implements QuackObservable
{
    ArrayList observers = new ArrayList<>();
    QuackObservable duck;

    public Observable(QuackObservable duck)
    {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Interface.Observer observer)
    {
        observers.add(observer);
    }

    @Override
    public void notifyObservers()
    {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext())
        {
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
