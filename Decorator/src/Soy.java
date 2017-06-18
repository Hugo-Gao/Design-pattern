/**
 * Created by Administrator on 2017/6/18.
 */
public class Soy extends CondimentDecorator
{
    Beverage beverage;

    public Soy(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public double cost()
    {
        return 0.30 + beverage.cost();
    }



    @Override
    public String getDescription()
    {
        return beverage.getDescription()+", Soy";
    }
}
