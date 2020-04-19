package observer.pattern.demo3;

public interface Subject {
    public void registerObserver(Observer4 observer);
    public void removeObserver(Observer4 observer);
    public void notifyObservers();
}
