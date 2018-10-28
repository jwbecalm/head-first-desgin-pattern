public abstract class Duck {
    //组合：在一个类中使用另一个类的对象（has a ）
    FlyBehavior flyBehavior;        // 成员Behavior是一个interface类，
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public abstract void display();     //像c++中的纯虚函数。子类中必须要提供实现

    public void performFly() {  //有新的fly类型时，父类无需修改
        flyBehavior.fly();      //把飞的行为委托给行为类，不在父类中单独定义
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    public void swim() {
        System.out.println("All ducks float, even decoys");
    }
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}