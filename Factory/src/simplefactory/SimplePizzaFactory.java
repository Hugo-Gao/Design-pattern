package simplefactory;

/**
 * Created by Administrator on 2017/6/18.
 */
public class SimplePizzaFactory
{
    public Pizza createPizza(String type)
    {
        Pizza pizza = null;

        if (type.equals("cheese"))
        {
            pizza = new CheesePizza();
        }else if(type.equals("clam"))
        {
            pizza = new ClamPizza();
        }else{
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
