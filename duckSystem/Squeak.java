package duck;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("嘎吱叫");
    }
}
