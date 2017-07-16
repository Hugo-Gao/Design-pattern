package Bean;

import java.util.ArrayList;
import java.util.Iterator;

import Interface.Observer;
import Interface.Quackable;

/**
 * Created by Administrator on 2017/7/14.
 */
public class Flock implements Quackable //组合模式
{
    ArrayList<Quackable> quackers = new ArrayList<>();
    Observable observable;

    public Flock()
    {
        observable = new Observable(this);
    }

    public void add(Quackable quackable)
    {
        quackers.add(quackable);
    }
    @Override
    public void quack()
    {
        System.out.println(quackers.size());
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext())
        {
            Quackable quackable= iterator.next();
            quackable.quack();
        }

    }

    public void registerObserver(Observer observer)
    {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext())
        {
            Quackable quackable= iterator.next();
            quackable.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers()
    {
        observable.notifyObservers();
    }
}
