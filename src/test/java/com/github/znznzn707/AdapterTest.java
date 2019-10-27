package com.github.znznzn707;

import Adapter.Duck;
import Adapter.MallardDuck;
import Adapter.TurkeyAdapter;
import Adapter.WildTurkey;
import org.junit.Test;

public class AdapterTest {
    @Test
    public void Test() {
        MallardDuck duck = new MallardDuck() ;
        WildTurkey turkey = new WildTurkey() ;
        Duck turkeyAdapter = new TurkeyAdapter(turkey) ;

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\n The turkeyAdapter says...");
        testDuck(turkeyAdapter);
    }
    public void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
