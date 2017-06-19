package simplefactory;

/**
 * Created by Administrator on 2017/6/18.
 */
public class PizzaStore
{
    SimplePizzaFactory   factory;

    public PizzaStore(SimplePizzaFactory factory)
    {
        this.factory = factory;
    }

    public Pizza orderPizza(String type)
    {
        Pizza pizza;
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
