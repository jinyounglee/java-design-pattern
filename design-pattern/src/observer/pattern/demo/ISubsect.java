package observer.pattern.demo;

public interface ISubsect {

    void register(IObserver o);

    void unregister(IObserver o);

    void notifyObservers(int i);
}


