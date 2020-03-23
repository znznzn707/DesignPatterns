package com.github.znznzn707;

import Bridge.CountDisplay;
import Bridge.Display;
import Bridge.StringDisplayImpl;
import org.junit.Test;

public class BridgeTest {
    @Test
    public void test() {
        Display d1 = new Display(new StringDisplayImpl("Hello, China.")) ;
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World!")) ;
        CountDisplay d3 = new
                CountDisplay(new StringDisplayImpl("Hello, Universe.")) ;
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}
