package observerPush;

public class DataSource extends Subject {

    private int dataSourceInt = 0;

    public void updateDataSource(int updateValue)
    {
        dataSourceInt = updateValue;
        notifyAllObservers(dataSourceInt);
    }
}
