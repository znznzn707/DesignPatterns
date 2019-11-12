package MenuComponent;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    ArrayList menuComponents = new ArrayList() ;
    String name ;
    String desc ;

    public Menu(String name, String desc) {
        this.name = name ;
        this.desc = desc ;
    }
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent) ;
    }
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent) ;
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i) ;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDesc() {
        return desc;
    }
    public void print() {
        System.out.print("\n"+getName());
        System.out.println(", "+getDesc());
        Iterator iterator = menuComponents.iterator() ;
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next() ;
            menuComponent.print();
        }
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }
}
