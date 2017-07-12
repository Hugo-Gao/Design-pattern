package singleton;

/**
 * Created by Administrator on 2017/6/19.
 */
public class ChocolateBoiler
{
    private static ChocolateBoiler chocolateBoiler;
    private boolean isEmpty;
    private ChocolateBoiler()
    {
        isEmpty = true;
        System.out.println("Initial");
    }

    public static ChocolateBoiler getInstance()
    {
        if (chocolateBoiler == null)
        {
            chocolateBoiler = new ChocolateBoiler();
        }
        return chocolateBoiler;
    }
    public void fill()
    {
        if(isEmpty)
        {
            isEmpty = false;
        }
    }
}
