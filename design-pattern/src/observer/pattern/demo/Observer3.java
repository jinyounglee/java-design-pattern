package observer.pattern.demo;

public class Observer3 implements IObserver {
    @Override
    public void update(String s, int i) {
        System.out.println("Observer3 ::: observer -> value is changed in " + s + " to : " + i);
    }
}
