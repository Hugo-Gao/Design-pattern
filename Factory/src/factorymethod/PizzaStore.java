package factorymethod;

/**
 * Created by Administrator on 2017/6/18.
 */
public abstract class PizzaStore
{
    public Pizza orderPizza(String type)
    {
        Pizza pizza;
        pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return  pizza;
    }
    public abstract Pizza createPizza(String type);
}
