package decorator.pattern.demo2;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("저는 날지 못합니다.");
    }
}
