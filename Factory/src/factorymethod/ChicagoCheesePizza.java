package factorymethod;

/**
 * Created by Administrator on 2017/6/18.
 */
public class ChicagoCheesePizza implements factorymethod.Pizza
{
    @Override
    public void prepare()
    {
        System.out.println("ChicagoCheesePizza"+" preparing");
    }

    @Override
    public void bake()
    {
        System.out.println("ChicagoCheesePizza"+" backing");

    }

    @Override
    public void cut()
    {
        System.out.println("ChicagoCheesePizza"+" cutting");

    }

    @Override
    public void box()
    {
        System.out.println("ChicagoCheesePizza"+" boxing");
    }
}
