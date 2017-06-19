package SimpleSlot;

/**
 * Created by Administrator on 2017/6/19.
 */
public class GarageDoorOpenCommand implements Command
{
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor)
    {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute()
    {
        garageDoor.lightOn();
        garageDoor.up();
        System.out.println("GarageDoor is open");
    }

    @Override
    public void undo()
    {
        garageDoor.lightClose();
        garageDoor.down();
        System.out.println("GarageDoor is down");

    }
}
