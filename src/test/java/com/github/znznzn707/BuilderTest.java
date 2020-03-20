package com.github.znznzn707;

import Builder.Builder;
import Builder.Director;
import Builder.HTMLBuilder;
import Builder.TextBuilder;
import org.junit.Test;
/**
 * @since 3/20/2020
 */
public class BuilderTest {

    Builder builder;
    Director director ;
    @Test
    public void testTextBuilder() {
        builder = new TextBuilder() ;
        director = new Director(builder) ;
        director.construct();
    }
    @Test
    public void testHTMLBuilder() {
        builder = new HTMLBuilder() ;
        director = new Director(builder) ;
        director.construct();
    }
}
