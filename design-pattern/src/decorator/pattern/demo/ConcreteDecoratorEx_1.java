package decorator.pattern.demo;

public class ConcreteDecoratorEx_1 extends AbstractDecorator{

    @Override
    public void doJob() {
        super.doJob();

        System.out.println("I am explicitly from Ex_1");
    }
}
