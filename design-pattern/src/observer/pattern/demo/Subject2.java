package observer.pattern.demo;

import java.util.ArrayList;
import java.util.List;

public class Subject2 implements ISubsect{


    List<IObserver> observerList = new ArrayList<IObserver>();

    private int _flag;

    public int getFlag() {
        return _flag;
    }

    public void setFlag(int _flag) {
        this._flag = _flag;


        notifyObservers(_flag);
    }

    @Override
    public void register(IObserver o) {
        observerList.add(o);
    }

    @Override
    public void unregister(IObserver o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers(int _flag) {
        for (int i=0;i<observerList.size();i++) {
            observerList.get(i).update(this.getClass().getSimpleName(), _flag);
        }
    }
}
