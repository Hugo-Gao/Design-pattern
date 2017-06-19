package SimpleSlot;

/**
 * Created by Administrator on 2017/6/19.
 */
public class GarageDoorCloseCommand implements Command
{
    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor)
    {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute()
    {
        garageDoor.lightClose();
        garageDoor.down();
        System.out.println("GarageDoor is down");
    }

    @Override
    public void undo()
    {
        garageDoor.lightClose();
        garageDoor.up();
        System.out.println("GarageDoor is on");
    }
}
