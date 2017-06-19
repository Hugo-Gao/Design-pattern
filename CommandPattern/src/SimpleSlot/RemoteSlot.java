package SimpleSlot;

/**
 * Created by Administrator on 2017/6/19.
 */
public class RemoteSlot
{
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;
    public RemoteSlot(int slotNum)
    {
        onCommands = new Command[slotNum];
        offCommands=new Command[slotNum];

        Command noCommand = new NoCommand();
        for (int i = 0; i < slotNum; i++)
        {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command on, Command off)
    {
        if(slot<0||slot>onCommands.length-1)
        {
            System.out.println("插槽位置错误");
            return;
        }
        
        onCommands[slot]=on;
        offCommands[slot] = off;
    }

    public void onButtonWasPress(int slot)
    {
        if(slot<0||slot>onCommands.length-1)
        {
            System.out.println("插槽位置错误");
            return;
        }
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPress(int slot)
    {
        if(slot<0||slot>offCommands.length-1)
        {
            System.out.println("插槽位置错误");
            return;
        }
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }
    public void undoButtonWasPress()
    {
        System.out.println("正在撤销上一个操作");
        undoCommand.undo();
    }
}
