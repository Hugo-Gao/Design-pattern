package singleton;

/**
 * Created by Administrator on 2017/6/19.
 */
public class Singleton
{
    private static Singleton uniqueInstance;

    private Singleton()
    {
        System.out.println("Initial");
    }

    public synchronized static Singleton getInstance()
    {
        if (uniqueInstance == null)
        {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    public static void test()
    {

    }
}
