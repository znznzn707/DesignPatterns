package ChainOfResponsibility;

/**发生问题的类
 * @since 4/2/2020
 */
public class Trouble {
    private int number ;   //问题遍s号

    public Trouble(int number) {
        this.number = number ;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "[Trouble " + number + "]" ;
    }
}
