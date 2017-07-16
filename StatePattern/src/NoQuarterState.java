/**
 * Created by Administrator on 2017/7/13.
 */
public class NoQuarterState implements State
{
    SugerMachine sugerMachine;

    public NoQuarterState(SugerMachine sugerMachine)
    {
        this.sugerMachine = sugerMachine;
    }

    @Override
    public void insertQuarter()
    {
        System.out.println("投币成功");
        sugerMachine.setState(sugerMachine.getHasQuarterState());

    }

    @Override
    public void ejectQuarter()
    {
        System.out.println("您还没有投币");
    }

    @Override
    public void turnCrank()
    {
        System.out.println("您还没有投币，请勿转动摇杆");
    }

    @Override
    public void dispense()
    {
        System.out.println("您还没有投币，无法吐出糖果");
    }

    @Override
    public String toString()
    {
        return "无硬币状态";
    }
}
