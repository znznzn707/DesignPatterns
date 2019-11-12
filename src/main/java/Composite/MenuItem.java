package MenuComponent;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
    String name ;
    String desc ;
    boolean vege ;
    double price ;

    public MenuItem(String name,
                    String desc,
                    boolean vege,
                    double price) {
        this.name = name ;
        this.desc = desc ;
        this.vege = vege ;
        this.price = price ;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVege() {
        return vege;
    }
    public void print() {
        System.out.print(" "+name);
        if(isVege())
            System.out.print("(v)");
        System.out.println(", "+getPrice());
        System.out.println("    -- "+getDesc());
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
