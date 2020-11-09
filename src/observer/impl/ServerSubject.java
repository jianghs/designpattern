package observer.impl;

import observer.Observer;
import observer.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: ServerSubject
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/10/20 14:36
 * @version: 1.0
 */
public class ServerSubject implements Subject {
    private List<Observer> observerList = new ArrayList<>();
    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public void regiserObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if (observerList == null || observerList.size() == 0) {
            System.out.println("无observer");
            return;
        }
        for (Observer observer : observerList) {
            observer.update(msg);
        }
    }
}
