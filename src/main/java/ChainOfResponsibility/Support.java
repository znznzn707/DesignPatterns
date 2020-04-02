package ChainOfResponsibility;

/**
 * @since 4/2/2020
 * 解决问题的抽象类
 */
public abstract class Support {
    private String name ;
    private Support next ;  //要推卸的对象

    public Support(String name) {
        this.name = name ;
    }
    public void setSupport(Support next) {
        this.next = next ;
    }

    public final void support(Trouble trouble) {
        if(resolve(trouble))
            done(trouble);
        else if(next != null)
            next.support(trouble) ;
        else
            fail(trouble);
    }
    public abstract boolean resolve(Trouble trouble) ;

    @Override
    public String toString() {
        return "[" + name + "]" ;
    }
    protected void done(Trouble trouble) {
        System.out.println(trouble + "is resolved by " + this + ".");
    }
    protected void fail(Trouble trouble) {
        System.out.println(trouble + "cannot be resolved.");
    }
}
