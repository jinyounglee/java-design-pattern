package observer.pattern.practice;

public class Observer2 implements IObserver2 {
    @Override
    public void update() {
        System.out.println("Subject has changed!!");
    }
}
