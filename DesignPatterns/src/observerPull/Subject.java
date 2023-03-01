package observerPull;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    public List<Observer> observerList = new ArrayList<Observer>();

    public void addObserver(Observer newObserver)
    {
        observerList.add(newObserver);
    }

    public void notifyObservers()
    {
        for(var observer:observerList)
        {
            observer.update();
        }
    }
}
