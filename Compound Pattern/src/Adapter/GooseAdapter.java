package Adapter;

import Bean.Goose;
import Bean.Observable;
import Interface.Observer;
import Interface.Quackable;

/**
 * Created by Administrator on 2017/7/14.
 */
public class GooseAdapter implements Quackable
{
    Goose goose;
    Observable observable;
    public GooseAdapter(Goose goose)
    {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack()
    {
        goose.honk();
        notifyObservers();
    }

    @Override
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
