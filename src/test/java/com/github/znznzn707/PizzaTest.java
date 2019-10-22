package com.github.znznzn707;

import Pizza.ChicagoPizzaStore;
import Pizza.NYPizzaStore;
import Pizza.Pizza;
import Pizza.PizzaStore;
import org.junit.Test;

public class PizzaTest {
    @Test
    public void TestPizza() {
        PizzaStore nyStore = new NYPizzaStore() ;
        PizzaStore chicagoStore = new ChicagoPizzaStore() ;

        Pizza pizza = nyStore.orderPizza("cheese") ;
        System.out.println("Ethan ordered a "+pizza.getName()+"\n");

        pizza = chicagoStore.orderPizza("cheese") ;
        System.out.println("Joel ordered a "+pizza.getName()+"\n");
    }
    @Test
    public  void TestPizza2() {
        Pizza2.PizzaStore nyPizzaStore = new Pizza2.NYPizzaStore() ;
        nyPizzaStore.orderPizza("cheese") ;

    }
}
