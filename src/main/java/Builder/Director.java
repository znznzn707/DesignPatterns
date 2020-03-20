package Builder;

/**
 * @since 3/20/2020
 * 负责利用建造者生产实例并进行组装
 */
public class Director {
    private Builder builder ;

    public Director(Builder builder) {
        this.builder = builder ;
    }

    /**
     * 组装
     */
    public void construct() {
        builder.makeTitle("Greenting");
        builder.makeString("从早上到晚上");
        builder.makeItems(new String[]
                {
                        "早上好",
                        "下午好"
                });
        builder.makeString("晚上");
        builder.makeItems(new String[] {
                "晚上好",
                "晚安",
                "再见"
        });
        builder.close();
    }
    public void print() {
        System.out.println();
    }
}
