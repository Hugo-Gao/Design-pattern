/**
 * Created by Administrator on 2017/7/13.
 */
public class Main
{
    public static void main(String[] args)
    {
        SugerMachine sugerMachine = new SugerMachine(7);

        sugerMachine.insertQuarter();
        sugerMachine.turnCrank();

        sugerMachine.insertQuarter();
        sugerMachine.turnCrank();

        sugerMachine.insertQuarter();
        sugerMachine.turnCrank();


        sugerMachine.insertQuarter();
        sugerMachine.turnCrank();
    }
}
