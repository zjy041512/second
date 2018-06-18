package duck;

public abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;


    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }


    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("会游泳");
    };

    public void display(){
        System.out.println("会展示");
    }

}
