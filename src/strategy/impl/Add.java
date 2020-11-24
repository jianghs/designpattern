package strategy.impl;

import strategy.Strategy;

/**
 * @className: Add
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/11/24 11:17
 * @version: 1.0
 */
public class Add implements Strategy {
    @Override
    public int cal(int a, int b) {
        return a + b;
    }
}
