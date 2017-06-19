package factorymethod;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Main
{
    public static void main(String[] args)
    {
        PizzaStore nyPizzaStore = new NYStylePizzaStore();
        nyPizzaStore.orderPizza("cheese");

        PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();
        chicagoPizzaStore.orderPizza("cheese");
    }
}
