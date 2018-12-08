public class SimplePizzaFactory {
    //无构造函数，只有一个create方法，返回某种pizza的对象
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }
        else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }
        else if (type.equals("clam")) {
            pizza = new ClamPizza();
        }
        else if (type.equals("veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}