package Bean;

import Adapter.GooseAdapter;
import Factory.CountingDuckFactory;
import Interface.AbstractDuckFactory;
import Interface.Quackable;

/**
 * Created by Administrator on 2017/7/14.
 */
public class DuckSimulator
{

    public static void main(String[] args)
    {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate(new CountingDuckFactory());
    }
    void simulate(AbstractDuckFactory factory)
    {
        Quackable redheadDuck = factory.createRedheadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable gooseAdapter = new GooseAdapter(new Goose());
        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseAdapter);
        System.out.println("\nDuck Simulator :With Observer");

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);
        simulate(flockOfDucks);
        System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");

    }

    void simulate(Quackable quackable)
    {
        quackable.quack();
    }
}
