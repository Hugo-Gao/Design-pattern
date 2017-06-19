package factorymethod;

/**
 * Created by Administrator on 2017/6/18.
 */
public class NYStyleCheesePizza implements factorymethod.Pizza
{
    @Override
    public void prepare()
    {
        System.out.println("NYStyleCheesePizza"+" preparing");
    }

    @Override
    public void bake()
    {
        System.out.println("NYStyleCheesePizza"+" backing");

    }

    @Override
    public void cut()
    {
        System.out.println("NYStyleCheesePizza"+" cutting");

    }

    @Override
    public void box()
    {
        System.out.println("NYStyleCheesePizza"+" boxing");
    }
}
