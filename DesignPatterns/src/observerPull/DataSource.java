package observerPull;

public class DataSource extends Subject{

    public int dataSourceInt = 100;

    public void updateDataSource()
    {
        notifyObservers();
    }

    public int getUpdate()
    {
        return dataSourceInt;
    }
}
