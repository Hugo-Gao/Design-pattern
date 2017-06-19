package SimpleSlot;

/**
 * Created by Administrator on 2017/6/19.
 */
public class NoCommand implements Command
{
    @Override
    public void execute()
    {
        System.out.println("No Command There");
    }

    @Override
    public void undo()
    {
        System.out.println("No Command There");
    }
}
