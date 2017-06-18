/**
 * Created by Administrator on 2017/6/18.
 */
public class Mocha extends CondimentDecorator
{
    Beverage beverage;

    public Mocha(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public double cost()
    {
        return 0.20 + beverage.cost();
    }



    @Override
    public String getDescription()
    {
        return beverage.getDescription()+", Mocha";
    }
}
