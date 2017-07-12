/**
 * Created by Administrator on 2017/7/11.
 */
public abstract class CaffeineBeverage
{
    final void prepareRecipe()
    {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments())
        {
            addCondiment();
        }
    }

     boolean customerWantsCondiments()
    {
        return true;
    }


    abstract void brew();

    abstract void addCondiment();

    final void pourInCup()
    {
        System.out.println("倒进杯子里");
    }

    final void boilWater()
    {
        System.out.println("煮开水");
    }
}
