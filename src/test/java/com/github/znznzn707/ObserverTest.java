package com.github.znznzn707;

import WeatherStation.*;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class WeatherStationTest {
    @Test
    public void Test1() {
        WeatherData weatherData = new WeatherData() ;
        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData) ;
        weatherData.setMeasurements(80,34,12f);
        weatherData.setMeasurements(50,12,54.7f);
        weatherData.setMeasurements(60,78,78.1f);
    }
    @Test
    public void Test2() {
        WeatherData2 weatherData2 = new WeatherData2() ;
        CurrentConditionDisplay2 currentConditionDisplay2 = new
                CurrentConditionDisplay2(weatherData2) ;
        MyConditionDisplay myConditionDisplay = new
                MyConditionDisplay(weatherData2) ;
        weatherData2.setMeasurements(80,34,12f);
        weatherData2.setMeasurements(50,12,54.7f);
        weatherData2.setMeasurements(60,78,78.1f);

        System.out.println(weatherData2.countObservers());
    }
    @Test
    public void TestInput() {
        int c ;
        try{
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("test.txt")
                            )
                    ) ;
            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
