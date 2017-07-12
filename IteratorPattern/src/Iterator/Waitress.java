package Iterator;

import java.util.Iterator;

/**
 * Created by Administrator on 2017/7/12.
 */
public class Waitress
{
    public Menu menu1;
    public Menu menu2;
    public Menu menu3;
    public Waitress(Menu menu1, Menu menu2, Menu menu3)
    {
        this.menu1 = menu1;
        this.menu2 = menu2;
        this.menu3 = menu3;
    }
    public void printMenu()
    {
        printMenu(menu1.createIterator());
        printMenu(menu2.createIterator());
        printMenu(menu3.createIterator());
    }

    public void printMenu(Iterator iterator)
    {
        while (iterator.hasNext())
        {
            System.out.println(iterator.next().toString());
        }
    }
}
