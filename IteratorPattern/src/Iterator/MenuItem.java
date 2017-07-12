package Iterator;

/**
 * Created by Administrator on 2017/7/11.
 */
public class MenuItem
{
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;
    @Override
    public String toString()
    {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", vegetarian=" + vegetarian +
                ", price=" + price +
                '}';
    }

    public MenuItem(String name, String description, boolean vegetarian, double price)
    {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public boolean isVegetarian()
    {
        return vegetarian;
    }

    public double getPrice()
    {
        return price;
    }
}
