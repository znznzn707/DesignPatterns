package com.github.znznzn707;

import MenuComponent.Menu;
import MenuComponent.MenuComponent;
import MenuComponent.MenuItem;
import MenuComponent.Waitress;
import org.junit.Test;

public class MenuComponentTest {
    @Test
    public void Test() {
        MenuComponent A = new Menu("A","A") ;
        MenuComponent B = new Menu("B","B") ;
        MenuComponent C = new Menu("C","C") ;
        MenuComponent allMenus = new Menu("ALL","ALL") ;
        allMenus.add(A);
        allMenus.add(B);
        allMenus.add(C);

        A.add(new MenuItem("D",
                "D",
                true,
                3.89)
        );
        B.add(new MenuItem("E",
                "E",
                true,
                1.59)
        );
        C.add(new MenuItem("F",
                "F",
                false,
                2.56)
        );
        Waitress waitress = new Waitress(allMenus) ;
        waitress.printMenu();
        System.out.println("********");
        waitress.printVegeMenu();
    }
}
