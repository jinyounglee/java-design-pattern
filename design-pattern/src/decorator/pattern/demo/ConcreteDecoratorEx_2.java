package decorator.pattern.demo;

public class ConcreteDecoratorEx_2 extends AbstractDecorator{

    @Override
    public void doJob() {
        super.doJob();

        System.out.println("Explicitly From DecoratorEx_2");
        System.out.println("*** END. Ex-2 ***");
    }
}
