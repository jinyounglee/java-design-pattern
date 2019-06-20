package strategy.pattern.demo;

public abstract class Animal {

    protected Fly fly;

    protected Cry cry;


    public void performCry(){
        fly.fly();
    }


    public void performFly(){
        cry.cry();
    }

    public void move(){
        System.out.println("move!!!!!");
    }

    public abstract void display();
}
