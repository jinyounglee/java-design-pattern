package proxypattern.proxyclasses;

import proxypattern.originalClasses.ConcreteSubject;
import proxypattern.originalClasses.Subject;

public class Proxy extends Subject {

    ConcreteSubject cs;

    @Override
    public void doSomeWork() {
        System.out.println("I am from ");


        // Lazy initialization
        if(cs == null) {
            cs = new ConcreteSubject();
        }

        cs.doSomeWork();
    }
}
