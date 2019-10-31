package com.github.znznzn707;

import CaffeineBeverage.CoffeeWithHook;
import CaffeineBeverage.Duck;
import org.junit.Test;

import java.util.Arrays;

public class CoffeeWithHookTest {
    @Test
    public void Test() {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook() ;
        coffeeWithHook.prepareRecipe();
    }
    @Test
    public void testDuck() {
        Duck[] ducks = {
                new Duck("Daffy",8) ,
                new Duck("Dewey",2) ,
                new Duck("Howard",7) ,
                new Duck("Louie",2)
        } ;
        System.out.println("Befoe sorting:");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nAfter sorting:");
        display(ducks);

    }
    public static void display(Duck[] ducks) {
        for(int i=0; i<ducks.length;i++)
            System.out.println(ducks[i]);
    }
}
