package simplefactory;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Main
{
    public static void main(String[] args)
    {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());//传入构造函数的是制作方法
        pizzaStore.orderPizza("cheese");
    }
}
