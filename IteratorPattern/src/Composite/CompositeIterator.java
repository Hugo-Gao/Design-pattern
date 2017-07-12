package Composite;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by Administrator on 2017/7/12.
 */
public class CompositeIterator implements Iterator
{
    Stack<Iterator<MenuComponent>> stack = new Stack<>();
    public CompositeIterator(Iterator<MenuComponent> iterator)
    {
        stack.push(iterator);
    }

    @Override
    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasNext()
    {
        if (stack.empty())
        {
            return false;
        }else
        {
            Iterator iterator = stack.peek();
            if (!iterator.hasNext())
            {
                stack.pop();
                return hasNext();
            }else
            {
                return true;
            }
        }
    }

    @Override
    public Object next()
    {
        if (hasNext())
        {
            Iterator iterator = stack.peek();
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            if (menuComponent instanceof Menu)
            {
                stack.push(menuComponent.createIterator());
            }
            return menuComponent;
        }else
        {
            return null;
        }
    }
}
