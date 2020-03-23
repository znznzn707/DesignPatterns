package Bridge;

/**
 * @since 3/23/2020
 * 子类扩展功能
 */
public class CountDisplay extends Display {


    public CountDisplay(DisplayeImpl impl) {
        super(impl);
    }

    /**
     * 扩展方法
     * @param times
     */
    public void multiDisplay(int times) {
        open();
        for(int i = 0; i < times; i++)
            print();
        close();
    }
}
