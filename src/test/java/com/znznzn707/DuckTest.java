package com.znznzn707;

import duck.Duck;
import duck.FlyRocketPowered;
import duck.MallardDuck;
import duck.ModelDuck;
import org.junit.Test;

public class DuckTest {
    MallardDuck mallardDuck = new MallardDuck() ;
    Duck model = new ModelDuck() ;

    public DuckTest(){
        System.out.println("DuckTest");
    }
    @Test
    public void MallardDuckTest(){
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();
    }
    @Test
    public void ModelDuckTest() {
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
