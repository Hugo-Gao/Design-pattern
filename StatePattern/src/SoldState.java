/**
 * Created by Administrator on 2017/7/13.
 */
public class SoldState implements State
{
    SugerMachine sugerMachine;

    public SoldState(SugerMachine sugerMachine)
    {
        this.sugerMachine = sugerMachine;
    }

    @Override
    public void insertQuarter()
    {
        System.out.println("请稍后，我们马上给你一颗糖果");
    }

    @Override
    public void ejectQuarter()
    {
        System.out.println("对不起，你已经转动了摇杆");

    }

    @Override
    public void turnCrank()
    {
        System.out.println("你不能再次转动摇杆了");
    }

    @Override
    public void dispense()
    {
        sugerMachine.releaseBall();
        if (sugerMachine.getCount() > 0)
        {
            sugerMachine.setState(sugerMachine.getNoQuarterState());
        }else
        {
            System.out.println("哦!!!!糖果卖完了");
            sugerMachine.setState(sugerMachine.getSoldOutState());

        }
    }

    @Override
    public String toString()
    {
        return "正在售出状态";
    }
}
