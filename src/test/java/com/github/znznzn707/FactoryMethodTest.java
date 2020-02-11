package com.github.znznzn707;

import FactoryMethod.ChicagoPizzaStore;
import FactoryMethod.NYPizzaStore;
import FactoryMethod.Pizza;
import FactoryMethod.PizzaStore;
import org.junit.Test;

public class FactoryMethodTest {
    @Test
    public void TestPizza() {
        PizzaStore nyStore = new NYPizzaStore() ;
        PizzaStore chicagoStore = new ChicagoPizzaStore() ;

        Pizza pizza = nyStore.orderPizza("cheese") ;
        System.out.println("Ethan ordered a "+pizza.getName()+"\n");

        pizza = chicagoStore.orderPizza("cheese") ;
        System.out.println("Joel ordered a "+pizza.getName()+"\n");
    }
}
