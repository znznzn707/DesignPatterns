package Bridge;

/**
 * @since 3/23/2020
 */
public class Display {
    private DisplayeImpl impl ;

    public Display(DisplayeImpl impl) {
        this.impl = impl ;
    }
    public void open() {
        impl.rawOpen();
    }
    public void print() {
        impl.rawPrint();
    }
    public void close() {
        impl.rawClose();
    }
    public final void display() {
        open();
        print();
        close();
    }

}
