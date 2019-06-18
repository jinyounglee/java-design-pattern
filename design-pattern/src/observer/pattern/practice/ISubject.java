package observer.pattern.practice;

import java.util.ArrayList;
import java.util.List;

public interface ISubject {

    void register(IObserver2 o2);

    void unregister(IObserver2 o2);

    void notifyObservers();

}
