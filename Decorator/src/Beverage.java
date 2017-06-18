/**
 * Created by Administrator on 2017/6/18.
 */
public abstract class Beverage
{
    String description="UnKnow Beverage";
    public String getDescription()
    {
        return description;
    }

    public abstract double cost();
}
