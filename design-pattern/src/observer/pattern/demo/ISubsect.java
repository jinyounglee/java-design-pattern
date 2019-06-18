package observer.pattern.demo;

public interface ISubsect {

    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();
}


