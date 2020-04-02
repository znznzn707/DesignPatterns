package ChainOfResponsibility;

/**
 * @since 4/2/2020
 * “永远不能解决问题的子类”,即resolve()返回false
 */
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    @Override
    public boolean resolve(Trouble trouble) {
        return false;
    }
}
