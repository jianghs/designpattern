package observer.impl;

import observer.Observer;

/**
 * @className: MailObserver
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/10/20 14:34
 * @version: 1.0
 */
public class MailObserver implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("{邮箱收到信息：}" + msg);
    }
}
