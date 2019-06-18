package observer.pattern.demo;

import observer.pattern.practice.IObserver2;

public class Observer2 implements IObserver {
    @Override
    public void update(String s, int i) {
        System.out.println("Observer2 ::: observer -> value is changed in " + s + " to : " + i);
    }
}
