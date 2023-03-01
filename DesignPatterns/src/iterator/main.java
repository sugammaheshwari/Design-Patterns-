package iterator;

public class main {

    public static void main(String[] args)
    {
        var bh = new browserHistory();

        bh.pushHistory("abc.com");
        bh.pushHistory("pqr.com");
        bh.pushHistory("mno.com");
        bh.pushHistory("-1");

        var iterator = bh.createBrowserHistoryIterator();
        /*
            Main theme behind iterator pattern is to create an iterator interface w/c
            will help to iterate over the object of browserHitory class and in future if
            internal implementation of bh changes then main will still be able to iterate over
            bh using the iterator as only changes will need to be done in browserHistory and its
            respective interface.
         */

        while(iterator.hasNext())
        {
            String url = iterator.current();
            System.out.println(url);
            iterator.next();
        }

    }
}
