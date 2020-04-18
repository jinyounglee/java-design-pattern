package decorator.pattern.demo2;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("저는 날고있어요!");
    }
}
