import java.util.Random;

/**
 * Created by Administrator on 2017/7/13.
 */
public class HasQuarterState implements State
{
    Random randomWinner = new Random(System.currentTimeMillis());
    SugerMachine sugerMachine;

    public HasQuarterState(SugerMachine sugerMachine)
    {
        this.sugerMachine = sugerMachine;
    }

    @Override
    public void insertQuarter()
    {
        System.out.println("你不能再塞硬币了");
    }

    @Override
    public void ejectQuarter()
    {
        System.out.println("硬币退回");
        sugerMachine.setState(sugerMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank()
    {
        System.out.println("你转动了摇杆");
        int winner = randomWinner.nextInt(10);
        if((winner==0)&&(sugerMachine.getCount()>1))
        {
            sugerMachine.setState(sugerMachine.getWinnerState());
        }else{
            sugerMachine.setState(sugerMachine.getSoldState());
        }
    }

    @Override
    public void dispense()
    {
        System.out.println("没有糖果可以滚出来");
    }

    @Override
    public String toString()
    {
        return "有硬币状态";
    }
}
