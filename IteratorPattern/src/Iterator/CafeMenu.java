package Iterator;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by Administrator on 2017/7/12.
 */
public class CafeMenu implements Menu
{
    private Hashtable<String, MenuItem> menuItems;

    public CafeMenu()
    {
        menuItems = new Hashtable<>();
        addItem("卡布奇诺", "咖啡，牛奶", true, 7);
        addItem("摩卡", "咖啡，巧克力", true, 8);

    }

    private void addItem(String name, String description, boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator createIterator()
    {
        return menuItems.values().iterator();
    }
}
