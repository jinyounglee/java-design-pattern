package observer.pattern.demo;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubsect{

    public Subject() {
    }

    private int _flag;

    public int getFlag() {
        return _flag;
    }

    public void setFlag(int _flag) {

        this._flag = _flag;

        notifyObservers();
    }

    List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void register(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(int i=0;i<observerList.size();i++) {
            observerList.get(i).update();
        }
    }
}
