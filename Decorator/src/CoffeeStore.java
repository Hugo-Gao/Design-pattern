/**
 * Created by Administrator on 2017/6/18.
 */
public class CoffeeStore
{
    public static void main(String[] args)
    {
        Beverage beverage = new Espresso(Size.small);
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription()+" cost "+beverage.cost());

        Beverage beverage2 = new Espresso(Size.mid);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()+" cost "+beverage2.cost());

        Beverage beverage3 = new Espresso(Size.large);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Soy(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()+" cost "+beverage3.cost());
    }
}
