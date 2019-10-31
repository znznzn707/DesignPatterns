package com.github.znznzn707;

import MenuIterator.DinerMenu;
import MenuIterator.Waitress;
import org.junit.Test;

public class MenuIteratorTest {
    @Test
    public void testDinerMenu() {
        DinerMenu dinerMenu = new DinerMenu() ;
        Waitress waitress = new Waitress(dinerMenu) ;
        waitress.printMenu();
    }
}
