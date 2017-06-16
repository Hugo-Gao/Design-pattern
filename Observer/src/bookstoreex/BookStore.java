package bookstoreex;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/16.
 */
public class BookStore implements Observable
{
    private List<Observer> observers;
    private String newBook;
    public BookStore()
    {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer)
    {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers()
    {
        if(newBook!=null)
        {
            for (Observer observer : observers)
            {
                observer.update(newBook);
            }
        }
        newBook=null;
    }

    public void newBookComing(String bookName)
    {
        newBook = bookName;
        notifyObservers();
    }

}
