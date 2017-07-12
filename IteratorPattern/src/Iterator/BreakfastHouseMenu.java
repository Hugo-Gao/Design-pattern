package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Administrator on 2017/7/11.
 */
public class BreakfastHouseMenu implements Menu
{
    private ArrayList<MenuItem> menuItems;

    public BreakfastHouseMenu()
    {
        menuItems = new ArrayList<>();
        addItem("燃面", "面条,辣椒,芽菜", false, 8);
        addItem("包子", "面粉,肉", false, 1);
        addItem("榨菜", "菜,辣椒", true, 1);
    }

    private void addItem(String name, String description, boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
    public ArrayList<MenuItem> getMenuItems()
    {
        return menuItems;
    }
    public Iterator createIterator()
    {
        return menuItems.iterator();
    }
}
