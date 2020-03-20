package Builder;

/**
 * @since 3/20/2020
 * 建造者的具体子类
 */
public class TextBuilder extends Builder{
    @Override
    public void makeTitle(String title) {
        System.out.print("==============\n") ;
        System.out.print("["+title+"]\n\n") ;
    }

    @Override
    public void makeString(String str) {
        System.out.println("str: \n"+str) ;
    }

    @Override
    public void makeItems(String[] items) {
        System.out.print("items:\n") ;
        for (String s:items)
            System.out.print(s+"\n") ;
    }

    @Override
    public void close() {
        System.out.print("==============\n") ;
    }
}
