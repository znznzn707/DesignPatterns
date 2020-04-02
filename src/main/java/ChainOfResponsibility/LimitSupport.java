package ChainOfResponsibility;

/**
 * @since 4/2/2020
 * Support的子类,
 * 特点：可以解决编号小于limit的问题
 */
public class LimitSupport extends Support{
    private int limit ;

    public LimitSupport(String name,int limit) {
        super(name);
        this.limit = limit;
    }
    @Override
    public boolean resolve(Trouble trouble) {
        if(trouble.getNumber() < limit)
            return true ;
        else
            return false ;
    }
}
