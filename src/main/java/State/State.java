package State;

/**
 * <p>该接口{@code State}描述了糖果机的状态
 */

public interface State {
    /**
     * <p>{@code insertQuarter}方法表示投币
     */
    public abstract void insertQuarter() ;

    /**
     * <p>{@code ejectQuarter}方法表示退币
     */
    public abstract void ejectQuarter() ;

    /**
     * <p>{@code turnCrank}方法表示转动曲柄
     */
    public abstract void turnCrank() ;

    /**
     * <p>{code dispense}方法表示发放糖果
     */
    public abstract void dispense() ;
}
