package simplefactory;

/**
 * Created by Administrator on 2017/6/18.
 */
public class ClamPizza implements Pizza
{
    @Override
    public void prepare()
    {
        System.out.println("ClamPizza"+" preparing");
    }

    @Override
    public void bake()
    {
        System.out.println("ClamPizza"+" backing");

    }

    @Override
    public void cut()
    {
        System.out.println("ClamPizza"+" cutting");

    }

    @Override
    public void box()
    {
        System.out.println("ClamPizza"+" boxing");
    }
}
