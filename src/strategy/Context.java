package strategy;

/**
 * @className: Context
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/11/24 11:19
 * @version: 1.0
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int exe(int a, int b) {
        return strategy.cal(a, b);
    }
}
