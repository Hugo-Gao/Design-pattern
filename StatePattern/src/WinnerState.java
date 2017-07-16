/**
 * Created by Administrator on 2017/7/13.
 */
public class WinnerState implements State
{
    SugerMachine sugerMachine;

    public WinnerState(SugerMachine sugerMachine)
    {
        this.sugerMachine = sugerMachine;
    }

    @Override
    public void insertQuarter()
    {
        System.out.println("错误操作");
    }

    @Override
    public void ejectQuarter()
    {
        System.out.println("错误操作");
    }

    @Override
    public void turnCrank()
    {
        System.out.println("错误操作");
    }

    @Override
    public void dispense()
    {
        System.out.println("恭喜，你抽中了再来一颗糖果的奖励");
        sugerMachine.releaseBall();
        if (sugerMachine.getCount() == 0)
        {
            sugerMachine.setState(sugerMachine.getSoldOutState());
        }else
        {
            sugerMachine.releaseBall();
            if (sugerMachine.getCount() == 0)
            {
                System.out.println("哦！！！！糖果卖完了");
                sugerMachine.setState(sugerMachine.getSoldOutState());
            }else
            {
                sugerMachine.setState(sugerMachine.getNoQuarterState());
            }
        }
    }
}
