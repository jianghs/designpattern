package factory.staticfactory;

/**
 * @className: Util
 * @description: 静态工厂 = 类 + 静态方法
 * @author: jianghs430
 * @createDate: 2020/10/21 14:23
 * @version: 1.0
 */
public class Util {

    private static boolean isEmpty(Object object) {
        return object.equals(null);
    }
}
