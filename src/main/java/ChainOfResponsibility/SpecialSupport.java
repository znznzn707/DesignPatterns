package ChainOfResponsibility;

/**
 * @since 4/2/2020
 * support的子类,
 * 只解决指定编号的问题
 */
public class SpecialSupport extends Support{
    private int number ;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }
    @Override
    public boolean resolve(Trouble trouble) {
        if(trouble.getNumber() == number)
            return true ;
        else
            return false;
    }
}
