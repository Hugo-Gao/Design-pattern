package simplefactory;

/**
 * Created by Administrator on 2017/6/18.
 */
public class CheesePizza implements Pizza
{
    @Override
    public void prepare()
    {
        System.out.println("CheesePizza"+" preparing");
    }

    @Override
    public void bake()
    {
        System.out.println("CheesePizza"+" backing");

    }

    @Override
    public void cut()
    {
        System.out.println("CheesePizza"+" cutting");

    }

    @Override
    public void box()
    {
        System.out.println("CheesePizza"+" boxing");
    }
}
