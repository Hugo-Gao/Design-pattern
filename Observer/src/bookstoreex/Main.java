package bookstoreex;

/**
 * Created by Administrator on 2017/6/16.
 */
public class Main
{
    public static void main(String[] args)
    {
        BookStore bookStore = new BookStore();
        Student xiaoming = new Student("小明", bookStore);
        Student xiaohua = new Student("小华", bookStore);
        Student xiaozhang = new Student("小张", bookStore);
        bookStore.newBookComing("知音漫客");
        bookStore.newBookComing("故事会");
        bookStore.newBookComing("看天下");
        bookStore.registerObserver(xiaohua);
    }
}
