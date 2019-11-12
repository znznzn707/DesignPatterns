package WeatherStation;

import java.util.Observable;
import java.util.Observer;

public class MyConditionDisplay implements Observer,DisplayElement {
    Observable observable ;
    private float temperature ;
    private float humidity ;

    public MyConditionDisplay(Observable observable) {
        this.observable = observable ;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData2) {
            WeatherData2 weatherData2 = (WeatherData2) o ;
            this.temperature = weatherData2.getTemperature() ;
            this.humidity = weatherData2.getHumidity() ;
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("My conditions: "+ temperature
                +"F degrees and "+humidity+"% humidity");
    }
}
