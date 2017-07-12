package Composite;

import java.util.Iterator;

/**
 * Created by Administrator on 2017/7/12.
 */
public class Waitress
{
    private MenuComponent allMenu;

    public Waitress(MenuComponent allMenu)
    {
        this.allMenu = allMenu;
    }

    public void printMenu()
    {
        allMenu.print();
    }

    public void printVegetarianMenu()
    {
        Iterator iterator = allMenu.createIterator();
        System.out.println("------------------素食菜单---------------");
        while (iterator.hasNext())
        {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try
            {
                if ((menuComponent.isVegetarian()))
                {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e)
            {
            }
        }
    }
}
