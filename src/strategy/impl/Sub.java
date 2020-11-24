package strategy.impl;

import strategy.Strategy;

/**
 * @className: Sub
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/11/24 11:18
 * @version: 1.0
 */
public class Sub implements Strategy {
    @Override
    public int cal(int a, int b) {
        return a - b;
    }
}
