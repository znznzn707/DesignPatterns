package Prototype;

import java.util.HashMap;

public class Manager {
    private HashMap showcase = new HashMap() ;
    public void regist(String name, Product product) {
        showcase.put(name,product) ;
    }
    public Product create(String protoname) {
        Product p = (Product) showcase.get(protoname) ;
        return p.createClone() ;
    }
}
