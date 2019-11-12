package MenuIterator;

import java.util.Iterator;

public class Waitress {
    Menu dinerMenu ;

    public Waitress(Menu dinerMenu) {
        this.dinerMenu = dinerMenu ;
    }
    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next() ;
            System.out.print(menuItem.getName()+",");
            System.out.print(menuItem.getPrice()+" -- ");
            System.out.print(menuItem.getDesc());
        }
    }
    public void printMenu() {
        Iterator iterator = dinerMenu.createIterator() ;
        printMenu(iterator);
    }
}
