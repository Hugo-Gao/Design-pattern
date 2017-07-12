package Iterator;

/**
 * Created by Administrator on 2017/7/12.
 */
public class Main
{
    public static void main(String[] args)
    {
        BreakfastHouseMenu breakfastHouseMenu = new BreakfastHouseMenu();
        DinnerHouseMenu dinnerHouseMenu = new DinnerHouseMenu();
        CafeMenu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(breakfastHouseMenu, dinnerHouseMenu,cafeMenu);
        waitress.printMenu();
    }
}
