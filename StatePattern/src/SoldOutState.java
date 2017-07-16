/**
 * Created by Administrator on 2017/7/13.
 */
public class SoldOutState implements State
{
    SugerMachine sugerMachine;

    public SoldOutState(SugerMachine sugerMachine)
    {
        this.sugerMachine = sugerMachine;
    }

    @Override
    public void insertQuarter()
    {
        System.out.println("对不起，糖果已经售空");
    }

    @Override
    public void ejectQuarter()
    {
        System.out.println("对不起，糖果已经售空且你没有投币");
    }

    @Override
    public void turnCrank()
    {
        System.out.println("对不起，糖果已经售空，请不要转动摇杆");
    }

    @Override
    public void dispense()
    {
        System.out.println("无效操作");
    }

    @Override
    public String toString()
    {
        return "售空状态";
    }
}
