package factorymethod;

/**
 * Created by Administrator on 2017/6/18.
 */
public class ChicagoStylePizzaStore extends PizzaStore
{
    @Override
    public Pizza createPizza(String type)
    {
        return new ChicagoCheesePizza();
    }
}
