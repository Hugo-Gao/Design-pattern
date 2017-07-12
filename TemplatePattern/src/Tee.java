import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2017/7/11.
 */
public class Tee extends CaffeineBeverage
{
    @Override
    void brew()
    {
        System.out.println("抓出茶叶");
    }

    @Override
    void addCondiment()
    {
        System.out.println("加调料");
    }

    @Override
    boolean customerWantsCondiments()
    {
        System.out.println("Y/N");
        String answer=null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            answer= bufferedReader.readLine();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        if(answer.toLowerCase().equals("y"))
        {
            return true;
        }else
        {
            return false;
        }
    }
}
