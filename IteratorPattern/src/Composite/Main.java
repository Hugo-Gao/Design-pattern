package Composite;

/**
 * Created by Administrator on 2017/7/12.
 */
public class Main
{
    public static void main(String[] args)
    {
        MenuComponent pancakeHouseMenu = new Menu("煎饼店菜单", "早餐");
        MenuComponent dinnerMenu = new Menu("午餐店菜单", "午餐");
        MenuComponent cafeMenu = new Menu("咖啡店菜单", "午餐");
        MenuComponent dessertMenu = new Menu("甜品店菜单", "甜品");

        MenuComponent allMenu = new Menu("菜单集", "所有菜单");
        allMenu.add(pancakeHouseMenu);
        allMenu.add(dinnerMenu);
        allMenu.add(cafeMenu);
        allMenu.add(dessertMenu);

        pancakeHouseMenu.add(new MenuItem("大煎饼", "大煎饼", true, 19));
        dinnerMenu.add(new MenuItem("红烧肉", "肉，辣椒，油", false, 20));
        cafeMenu.add(new MenuItem("卡布奇诺", "咖啡，牛奶", true, 7));
        dessertMenu.add(new MenuItem("卡布奇诺甜品", "咖啡，牛奶", true, 7));


        Waitress waitress = new Waitress(allMenu);
        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
