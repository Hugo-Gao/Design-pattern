package SimpleSlot;

/**
 * Created by Administrator on 2017/6/19.
 */
public class MacroOnCommand implements Command
{
    private Command[] commands;

    public MacroOnCommand(Command[] commands)
    {
        this.commands = commands;
    }

    @Override
    public void execute()
    {
        for (int i = 0; i < commands.length; i++)
        {
            commands[i].execute();
        }
    }

    @Override
    public void undo()
    {
        for (int i = 0; i < commands.length; i++)
        {
            commands[i].undo();
        }
    }
}
