package observer.pattern.demo;

public class ObserverPatternDemo3Ex {


    public static void main(String[] args) {

        System.out.println("*** Observer Pattern Demo3 ***\n");

        Subject sub1 = new Subject();
        Subject2 sub2 = new Subject2();


        Observer o1 = new Observer();
        Observer2 o2 = new Observer2();
        Observer3 o3 = new Observer3();


        sub1.register(o1);
        sub1.register(o2);


        sub2.register(o2);
        sub2.register(o3);

        sub1.setFlag(2000);

        sub2.setFlag(300);

        sub1.unregister(o2);
        sub1.setFlag(30000);

        sub2.setFlag(400000000);
    }
}
