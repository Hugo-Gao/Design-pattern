package Iterator;

import java.util.Iterator;

/**
 * Created by Administrator on 2017/7/11.
 */
public class DinnerHouseMenu implements Menu
{
    static final int MAX_ITEMS=6;
    private int numOfItems=0;
    MenuItem[] menuItems;

    public DinnerHouseMenu()
    {
        this.menuItems = new MenuItem[MAX_ITEMS];

        addItem("红烧肉", "肉，辣椒，油", false, 20);
        addItem("清蒸鱼", "鱼,冬瓜", false, 28);
        addItem("烧凤尾", "凤尾", true, 6);
    }

    private void addItem(String name, String description, boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numOfItems>=MAX_ITEMS)
        {
            System.err.print("菜单满了");
        }
        else
        {
            menuItems[numOfItems] = menuItem;
            numOfItems++;
        }
    }

    public MenuItem[] getMenuItems()
    {
        return menuItems;
    }

    public Iterator createIterator()
    {
        return new DinnerMenuIterator(menuItems);
    }
}
