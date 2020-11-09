package observer;

import observer.impl.MailObserver;
import observer.impl.MessageObserver;
import observer.impl.OtherObserver;
import observer.impl.ServerSubject;

/**
 * @className: Main
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/10/20 14:40
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        ServerSubject subject = new ServerSubject();
        subject.setMsg("这是一条通知");

        Observer mailObserver = new MailObserver();
        subject.regiserObserver(mailObserver);

        Observer messageObserver = new MessageObserver();
        subject.regiserObserver(messageObserver);

        Observer observer = new OtherObserver();
        subject.regiserObserver(observer);

        subject.removeObserver(mailObserver);

        subject.notifyObservers();
    }
}
