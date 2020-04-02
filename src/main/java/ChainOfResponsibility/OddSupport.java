package ChainOfResponsibility;

/**
 * @since 4/2/2020
 * support的子类,
 * 特点:可以解决奇数编号的问题
 */
public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }
    @Override
    public boolean resolve(Trouble trouble) {
        if(trouble.getNumber() % 2 == 1)
            return true ;
        else
            return false ;
    }
}
