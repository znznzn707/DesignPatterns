package MenuIterator;

import java.util.Iterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6 ;
    MenuItem[] menuItems ;
    int numberOfItems = 0;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS] ;
        addItem("A","A",true,2.99);
        addItem("B","B",true,2.99);
        addItem("C","C",true,3.99);

    }
    public void addItem(String name,
                        String desc,
                        boolean vege,
                        double price) {
        MenuItem menuItem = new MenuItem(name,desc,vege,price) ;
        if(numberOfItems >= MAX_ITEMS)
            System.out.println("Menu is full.");
        else{
            menuItems[numberOfItems] = menuItem ;
            numberOfItems++ ;
        }
    }

    @Override
    public Iterator createIterator() {
        Iterator DinerIterator = new DinerMenuIterator(menuItems) ;
        return DinerIterator ;
    }
}
