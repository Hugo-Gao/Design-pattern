/**
 * Created by Administrator on 2017/6/18.
 */
public class Whip extends CondimentDecorator
{
    Beverage beverage;

    public Whip(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public double cost()
    {
        return 0.56+beverage.cost();
    }


    @Override
    public String getDescription()
    {
        return beverage.getDescription()+", Whip";
    }
}
