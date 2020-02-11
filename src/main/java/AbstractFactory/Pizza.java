package AbstractFactory;

public abstract class Pizza {
    String name ;
    Dough dough ;
    Sauce sauce ;
    Cheese cheese ;
    Pepperoni pepperoni ;
    Clams clams ;

    abstract void prepare() ;

    void bake() {
        System.out.println("Bake");
    }
    void cut() {
        System.out.println("Cut");
    }
    void box() {
        System.out.println("Box");
    }
    void setName(String name) {
        this.name = name ;
    }
    String getName() {
        return name ;
    }
}
