package observer;

/**
 * @className: Subject
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/10/20 14:20
 * @version: 1.0
 */
public interface Subject {
    /**
     * 注册
     * @param observer
     */
    void regiserObserver(Observer observer);

    /**
     * 移除
     * @param observer
     */
    void removeObserver(Observer observer);


    /**
     * 通知
     */
    void notifyObservers();
}
