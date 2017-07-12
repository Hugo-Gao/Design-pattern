package Composite;

import java.util.Iterator;

/**
 * Created by Administrator on 2017/7/12.
 */
public class NullIterator implements Iterator
{

    @Override
    public boolean hasNext()
    {
        return false;
    }

    @Override
    public Object next()
    {
        return null;
    }

    @Override
    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
