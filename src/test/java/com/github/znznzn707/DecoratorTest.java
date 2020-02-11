package com.github.znznzn707;

import Decorator.*;
import org.junit.Test;

public class DecoratorTest {
    @Test
    public void Test() {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription()
        +"$"+espresso.cost());

        Beverage darkroast = new DarkRoast() ;
        darkroast = new Mocha(darkroast);
        darkroast = new Whip(darkroast) ;
        System.out.println(darkroast.getDescription()
                +"$"+darkroast.cost());

        Beverage houseblend = new HouseBlend() ;
        houseblend = new Mocha(houseblend) ;
        houseblend = new Whip(houseblend) ;
        System.out.println(houseblend.getDescription()
        +"$"+houseblend.cost());
    }
}
