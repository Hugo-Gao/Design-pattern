package Bean;

import Interface.Observer;
import Interface.QuackObservable;

/**
 * Created by Administrator on 2017/7/14.
 */
public class Quackologist implements Observer
{
    @Override
    public void update(QuackObservable quackObservable)
    {
        System.out.println("Quackologist: "+quackObservable+"just quacked");
    }
}
