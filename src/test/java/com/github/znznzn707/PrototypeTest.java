package com.github.znznzn707;

import Prototype.Manager;
import Prototype.MessageBox;
import Prototype.Product;
import Prototype.UnderlinePen;
import org.junit.Test;

public class PrototypeTest {
    @Test
    public void test() {
        Manager manager = new Manager() ;
        UnderlinePen upen = new UnderlinePen('~') ;
        MessageBox mbox = new MessageBox('*') ;
        MessageBox sbox = new MessageBox('/') ;
        manager.regist("strong message",upen);
        manager.regist("warning box",mbox);
        manager.regist("slash box",sbox);

        Product p1 = manager.create("strong message") ;
        p1.use("Hello, world");
        Product p2 = manager.create("warning box") ;
        p2.use("Hello, world");
        Product p3 = manager.create("slash box") ;
        p3.use("Hello, world");
        System.out.println("upen: "+upen.hashCode());
        System.out.println("p1: "+p1.hashCode());
    }
}
