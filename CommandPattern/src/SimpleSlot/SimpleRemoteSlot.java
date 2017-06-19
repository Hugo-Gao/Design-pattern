package SimpleSlot;

/**
 * Created by Administrator on 2017/6/19.
 */
public class SimpleRemoteSlot
{
    private Command slot;

    public SimpleRemoteSlot()
    {
    }

    public void setCommand(Command command)
    {
        slot = command;
    }
    public void buttonWasPressed()
    {
        slot.execute();
    }
}
