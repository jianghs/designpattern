package singleton.method3;

/**
 * @className: Singleton
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/11/24 10:27
 * @version: 1.0
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton () {}

    public Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
