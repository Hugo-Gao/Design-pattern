/**
 * Created by Administrator on 2017/6/18.
 */
public class Espresso extends Beverage
{
    Size size;
    public Espresso(Size size)
    {
        description = "Espresso Coffee";
        this.size = size;
    }

    @Override
    public double cost()
    {
        if(size==Size.small)
        {
            return 0.80;
        }else if (size==Size.mid)
        {
            return 1.50;
        }else
            return 2.10;

    }

    @Override
    public String getDescription()
    {
        return size+" Espresso";
    }
}
