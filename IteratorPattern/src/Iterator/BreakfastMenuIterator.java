package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Administrator on 2017/7/12.
 */
public class BreakfastMenuIterator implements Iterator
{
    private ArrayList<MenuItem> menuItems;
    int position=0;
    public BreakfastMenuIterator(ArrayList<MenuItem> menuItems)
    {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext()
    {
        if (position >= menuItems.size() || menuItems.get(position) == null)
        {
            return false;
        }else
        {
            return true;
        }
    }

    @Override
    public Object next()
    {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}
