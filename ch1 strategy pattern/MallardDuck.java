public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();   // flyBehavior是父类中的成员，在这里实例化为对应的行为
    }

    public void display() {
        System.out.println("I'am a real Mallard duck");
    }
}