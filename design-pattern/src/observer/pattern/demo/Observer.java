package observer.pattern.demo;

public class Observer implements IObserver{

    public Observer() {
    }

    @Override
    public void update(String s, int i) {
        System.out.println("Observer ::: observer -> value is changed in " + s + " to : " + i);
    }
}
