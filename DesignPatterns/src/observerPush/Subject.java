package observerPush;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observerList=new ArrayList<Observer>();

    public void addObserver(Observer newObserver)
    {
        observerList.add(newObserver);
    }

    public void removeObserver(Observer oldObserver)
    {
        observerList.remove(oldObserver);
    }
    public void notifyAllObservers(int updateValue)
    {
        for(var observer:observerList)
        {
            observer.update(updateValue);
        }
    }
}
