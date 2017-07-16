package Factory;

import Bean.DuckCall;
import Bean.MallardDuck;
import Bean.QuackCounter;
import Bean.RedheadDuck;
import Bean.RubberDuck;
import Interface.AbstractDuckFactory;
import Interface.Quackable;
/**
 * Created by Administrator on 2017/7/14.
 */
public class CountingDuckFactory extends AbstractDuckFactory
{
    @Override
    public Quackable createMallardDuck()
    {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck()
    {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall()
    {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck()
    {
        return new QuackCounter(new RubberDuck());
    }
}
