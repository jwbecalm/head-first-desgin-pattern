public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;    //可以用接口定义一个对象？

    // 构造函数，传入一个Subject对象，是否可以修改为WeathData类？
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    public void display() {
        System.out.println("Current conditions: " + temperature 
        + "F degress and " + humidity + "% humidity");
    }
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this. humidity = humidity;
        display();
    }

}