package MenuComponent;

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus ;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus ;
    }
    public void printMenu() {
        allMenus.print();
    }
    public void printVegeMenu() {
        Iterator iterator = allMenus.createIterator() ;
        System.out.println();
        while(iterator.hasNext()) {
            MenuComponent menuComponent =
                    (MenuComponent) iterator.next() ;
            try{
                if(menuComponent.isVege())
                    menuComponent.print();
            }catch (UnsupportedOperationException e){
            }
        }
    }
}
