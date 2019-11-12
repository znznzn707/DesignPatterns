package MenuIterator;

public class MenuItem  {
    String name ;
    String desc ;
    boolean vege ;
    double price ;

    public MenuItem(String name,
                    String desc,
                    boolean vege,
                    double price) {
        this.name = name ;
        this.desc=  desc ;
        this.vege = vege ;
        this.price = price ;
    }
    public String getName() {
        return name ;
    }

    public String getDesc() {
        return desc;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVege() {
        return vege;
    }

    }
