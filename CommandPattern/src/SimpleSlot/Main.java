package SimpleSlot;

/**
 * Created by Administrator on 2017/6/19.
 */
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("---------------------单空位插槽---------------------------");
        SimpleRemoteSlot slot = new SimpleRemoteSlot();//一个插槽的插线板
        slot.setCommand(new LightOnCommand(new Light()));
        slot.buttonWasPressed();
        slot.setCommand(new GarageDoorOpenCommand(new GarageDoor()));
        slot.buttonWasPressed();
        System.out.println("---------------------多空位插槽---------------------------");
        RemoteSlot remoteSlot = new RemoteSlot(2);
        remoteSlot.setCommand(0, new LightOnCommand(new Light()), new LightOffCommand(new Light()));
        remoteSlot.onButtonWasPress(0);
        remoteSlot.offButtonWasPress(0);
        remoteSlot.undoButtonWasPress();
        remoteSlot.setCommand(1, new GarageDoorOpenCommand(new GarageDoor()), new GarageDoorCloseCommand(new GarageDoor()));
        remoteSlot.onButtonWasPress(1);
        remoteSlot.undoButtonWasPress();
        //宏命令
        System.out.println("-----------------------宏命令-----------------");
        Command[] onCommands = new Command[]{new LightOnCommand(new Light()), new GarageDoorCloseCommand(new GarageDoor())};
        Command[] offCommands = new Command[]{new LightOffCommand(new Light()), new GarageDoorOpenCommand(new GarageDoor())};
        Command macroOnCommand = new MacroOnCommand(onCommands);
        Command macroOffCommand = new MacroOnCommand(offCommands);
        remoteSlot.setCommand(1, macroOnCommand,macroOffCommand);
        remoteSlot.onButtonWasPress(1);
        remoteSlot.offButtonWasPress(1);
        remoteSlot.undoButtonWasPress();
    }
}
