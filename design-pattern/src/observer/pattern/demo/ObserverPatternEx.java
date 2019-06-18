package observer.pattern.demo;

public class ObserverPatternEx {

    public static void main(String[] args) {

        System.out.println("***Observer Pattern Demo***\n");

        Observer o1 = new Observer();
        Subject s1 = new Subject();


        s1.register(o1);

        System.out.println("Setting flag = 5");
        s1.setFlag(5);

        s1.setFlag(25);
        s1.unregister(o1);

        s1.setFlag(50);
    }

    public ObserverPatternEx() {
    }
}
