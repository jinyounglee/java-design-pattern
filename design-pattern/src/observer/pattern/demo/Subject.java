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

        notifyObservers(_flag);
    }

    List<IObserver> observerList = new ArrayList<IObserver>();

    @Override
    public void register(IObserver o) {
        observerList.add(o);
    }

    @Override
    public void unregister(IObserver o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers(int value) {
        for(int i=0;i<observerList.size();i++) {

            System.out.println("just className : " + this.getClass().getName());
            System.out.println("just simpleName : " + this.getClass().getSimpleName());
            System.out.println("just canonicalName : " + this.getClass().getCanonicalName());
            System.out.println("just packageName : " + this.getClass().getPackageName());

            observerList.get(i).update(this.getClass().getSimpleName(), value);
        }
    }
}
