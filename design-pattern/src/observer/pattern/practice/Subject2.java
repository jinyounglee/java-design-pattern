package observer.pattern.practice;

import java.util.ArrayList;
import java.util.List;

public class Subject2 implements ISubject {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    List<IObserver2> observer2List = new ArrayList<IObserver2>();




    @Override
    public void register(IObserver2 o2) {
        observer2List.add(o2);
    }

    @Override
    public void unregister(IObserver2 o2) {
        observer2List.remove(o2);
    }

    @Override
    public void notifyObservers() {
        System.out.println("subject changed!!!!");
    }



}
