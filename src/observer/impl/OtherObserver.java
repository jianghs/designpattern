package observer.impl;

import observer.Observer;

/**
 * @className: OtherObserver
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/10/20 14:47
 * @version: 1.0
 */
public class OtherObserver implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("其他观察者收到：" + msg);
    }
}
