package singleton;

/**
 * Created by Administrator on 2017/6/19.
 */
public class Main
{
    public static void main(String[] args)
    {
       new Thread(new Runnable()
       {
           @Override
           public void run()
           {
               Singleton.getInstance();
           }
       }).start();
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                Singleton.getInstance();
            }
        }).start();
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                Singleton.getInstance();
            }
        }).start();
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                Singleton.getInstance();
            }
        }).start();
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                Singleton.getInstance();
            }
        }).start();
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                Singleton.getInstance();
            }
        }).start();
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                Singleton.getInstance();
            }
        }).start();
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                Singleton.getInstance();
            }
        }).start();
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                Singleton.getInstance();
            }
        }).start();
    }
}
