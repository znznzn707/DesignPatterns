package MenuIterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] items ;
    int position = 0 ;

    public DinerMenuIterator(MenuItem[] item) {
        this.items = item ;
    }
    @Override
    public boolean hasNext() {
        if(position >= items.length ||
                items[position] ==null)
            return false ;
        else
            return true ;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position] ;
        position++ ;
        return menuItem ;
    }

    @Override
    public void remove() {
        if(position <= 0)
            throw new IllegalStateException("position = 0") ;
        if(items[position-1] != null){
            for(int i=position-1 ;i<items.length-1;i++)
                items[i] = items[i+1] ;
        }
        items[items.length-1] = null ;
    }
}
