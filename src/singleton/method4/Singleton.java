package singleton.method4;

/**
 * @className: Singleton
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/11/24 10:32
 * @version: 1.0
 */
public class Singleton {

    private Singleton() {}

    private static class SingletonHolder {
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
}
