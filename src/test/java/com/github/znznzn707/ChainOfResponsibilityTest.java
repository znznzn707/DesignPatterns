package com.github.znznzn707;

import ChainOfResponsibility.*;
import org.junit.Test;

/**
 * @since 4/2/2020
 */
public class ChainOfResponsibilityTest {

    @Test
    public void testChain() {
        Support alice = new NoSupport("Alice") ;
        Support bob  = new LimitSupport("Bob",100) ;
        Support charlie = new SpecialSupport("Charlie",429) ;
        Support diana = new LimitSupport("diana",200) ;
        Support elmo = new OddSupport("Elmo") ;
        Support fred = new LimitSupport("Fred",300) ;

        alice.setSupport(bob);
        bob.setSupport(charlie);
        charlie.setSupport(diana);
        diana.setSupport(elmo);
        elmo.setSupport(fred);

        for(int i = 0; i < 500; i+= 33) {
            alice.support(new Trouble(i));
        }
    }
}
