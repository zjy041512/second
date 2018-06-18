package duck;

public class DuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        //mallard.performQuack();
        //指定QuackBehavior的具体实现才能调用performQuack()方法
        mallard.setQuackBehavior(new Squeak());
        mallard.performQuack();
    }
}
