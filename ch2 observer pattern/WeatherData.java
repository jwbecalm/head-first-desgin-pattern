import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList observers;     //拥有一个observer的列表
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }
    //Subject接口实现：注册（订阅）
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    //Subject接口实现：删除（取消订阅）
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }
    //Subject接口实现：通知每一个Observer
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            // 在notify中遍历每一个注册的Observer，调用Observer接口的update实现
            observer.update(temperature, humidity, pressure);
        }
    }
    // 气象数据更新时，此方法会被调用：通知观察者们
    public void measurementsChanged() {
        notifyObserver();
    }
    // 测试用
    public void setMeasureMents(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}