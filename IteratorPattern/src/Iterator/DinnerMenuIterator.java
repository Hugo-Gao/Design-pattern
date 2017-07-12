package Iterator;

import java.util.Iterator;

/**
 * Created by Administrator on 2017/7/12.
 */
public class DinnerMenuIterator implements Iterator
{
    private MenuItem[] menuItems;
    int position=0;


    public DinnerMenuIterator(MenuItem[] menuItems)
    {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext()
    {
        if (position >= menuItems.length || menuItems[position] == null)
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
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }

    @Override
    public void remove()
    {
        if (position <= 0)
        {
            throw new IllegalStateException("没有可删除的元素");
        }

        if (menuItems[position - 1] != null)
        {
            for (int i=position-1;i<menuItems.length-1;i++)
            {
                menuItems[i]=menuItems[i+1];
            }
            menuItems[menuItems.length - 1] = null;
        }
    }
}
