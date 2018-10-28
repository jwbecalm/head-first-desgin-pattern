public class MiniDuckSimulator {
    public static void main(String[] agrs) {
        Duck mallard = new MallardDuck();
        mallard.performFly();   // perform方法在父类Duck中定义
        mallard.performQuack(); 

        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();   // 把fly的行为（算法）封装起来，并可以互相替换（set方法）。使用者无需关注算法细节

        mallard.display();
        mallard.swim();
    }
}