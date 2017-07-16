/**
 * Created by Administrator on 2017/7/13.
 */
public class SugerMachine
{
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    State state = soldOutState;
    int count = 0;

    public int getCount()
    {
        return count;
    }

    public State getSoldOutState()
    {
        return soldOutState;
    }

    public State getNoQuarterState()
    {
        return noQuarterState;
    }

    public State getHasQuarterState()
    {
        return hasQuarterState;
    }

    public State getSoldState()
    {
        return soldState;
    }



    public SugerMachine(int count)
    {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = count;
        if (count > 0)
        {
            state = noQuarterState;
        }
    }

    public void insertQuarter()
    {
        state.insertQuarter();
    }

    public void ejectQuarter()
    {
        state.ejectQuarter();
    }

    public void turnCrank()
    {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state)
    {
        this.state = state;
    }

    public State getState()
    {
        return state;
    }

    public State getWinnerState()
    {
        return winnerState;
    }

    void releaseBall()
    {
        System.out.println("一颗糖果正从锁孔里滚出来\n");
        if (count != 0)
        {
            count--;

        }
    }
}
