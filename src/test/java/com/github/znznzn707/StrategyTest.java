package com.github.znznzn707;

import Strategy.Duck;
import Strategy.FlyRocketPowered;
import Strategy.MallardDuck;
import Strategy.ModelDuck;
import org.junit.Test;

public class StrategyTest {
    MallardDuck mallardDuck = new MallardDuck() ;
    Duck model = new ModelDuck() ;

    public StrategyTest(){
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
