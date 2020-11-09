package observer.impl;

import observer.Observer;

/**
 * @className: MessageObserver
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/10/20 14:32
 * @version: 1.0
 */
public class MessageObserver implements Observer {

    @Override
    public void update(String msg) {
        System.out.println("{短信收到信息：}" + msg);
    }
}
