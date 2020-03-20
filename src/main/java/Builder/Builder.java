package Builder;

/**
 * @since 3/20/2020
 *负责生产实例
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items) ;
    public abstract void close() ;
}
