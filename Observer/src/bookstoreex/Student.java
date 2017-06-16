package bookstoreex;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/16.
 */
public class Student implements DisplayElement , Observer
{
    private String name;
    private List<String> hasBooks;
    private Observable observable;
    public Student(String name,Observable observable)
    {
        this.name = name;
        this.hasBooks = new ArrayList<>();
        this.observable = observable;
        observable.registerObserver(this);
    }

    @Override
    public void update(String book)
    {
        hasBooks.add(book);
        System.out.print(name+"买到了书<"+book+">   ");
        display();
    }

    @Override
    public void display()
    {
        System.out.println(name+"有书->"+hasBooks.toString());
    }
}
