package Composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Administrator on 2017/7/12.
 */
public class Menu extends MenuComponent
{
    private ArrayList<MenuComponent> menuComponents;
    private String name;
    private String description;

    public Menu(String name, String description)
    {
        menuComponents = new ArrayList<>();
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent)
    {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent)
    {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i)
    {
        return menuComponents.get(i);
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public String getDescription()
    {
        return description;
    }

    @Override
    public void print()
    {
        System.out.println(toString());
        System.out.println("---------------------------");
        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext())
        {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }

    @Override
    public String toString()
    {
        return "Menu{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public Iterator createIterator()
    {
        return new CompositeIterator(menuComponents.iterator());
    }
}
