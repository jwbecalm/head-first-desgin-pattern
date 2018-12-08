import java.util.ArrayList;

public abstract class Pizza {   //所有具体的pizza都必须继承这个类
    String name;
    String dough;
    Stirng sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("Preparing " + name);
    }
    void bake(){
        System.out.println("Bake for 25 minutes...");
    }
    void cut(){
        System.out.println("Cutting the pizza...");
    }
    void box() {
        System.out.println("Place pizza in box");
    }
    public Stirng getName(){
        return name;
    }
}