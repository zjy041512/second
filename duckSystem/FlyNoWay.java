package duck;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("无法飞");
    }
}
