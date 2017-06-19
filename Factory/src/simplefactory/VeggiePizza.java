package simplefactory;

/**
 * Created by Administrator on 2017/6/18.
 */
public class VeggiePizza implements Pizza
{
    @Override
    public void prepare()
    {
        System.out.println("VeggiePizza"+" preparing");
    }

    @Override
    public void bake()
    {
        System.out.println("VeggiePizza"+" backing");

    }

    @Override
    public void cut()
    {
        System.out.println("VeggiePizza"+" cutting");

    }

    @Override
    public void box()
    {
        System.out.println("VeggiePizza"+" boxing");
    }
}
