package observerPush;

public class Main {

    public static void main(String[] args)
    {
        DataSource ds = new DataSource();
        spreadSheet ss1 = new spreadSheet();
        spreadSheet ss2 = new spreadSheet();

        ds.addObserver(ss1);
        ds.addObserver(ss2);

        ds.updateDataSource(20);
    }
}
