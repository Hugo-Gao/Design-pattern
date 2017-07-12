package singleton;

/**
 * Created by Administrator on 2017/6/19.
 */
public class Singleton
{
    private static Singleton uniqueInstance=new Singleton();

    private Singleton()
    {
        System.out.println("Initial");
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

}
