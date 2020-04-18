package decorator.pattern.demo2;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();

        model.performFly();
        model.performQuack();

        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
