package Bean;

import Interface.Observer;
import Interface.Quackable;

/**
 * Created by Administrator on 2017/7/14.
 */
public class QuackCounter implements Quackable
{
    Quackable duck;
    static int numberofQuacks=0;
    Observable observable;

    public void registerObserver(Observer observer)
    {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers()
    {
        observable.notifyObservers();
    }
    public QuackCounter(Quackable duck)
    {
        this.duck = duck;
        observable = new Observable(this);
    }
    public void quack()
    {
        duck.quack();
        numberofQuacks++;
        notifyObservers();
    }

    public static int getQuacks()
    {
        return numberofQuacks;
    }
}
