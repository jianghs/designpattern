package strategy;

import strategy.impl.Add;
import strategy.impl.Sub;

/**
 * @className: Start
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/11/24 11:21
 * @version: 1.0
 */
public class Start {
    public static void main(String[] args) {
        Context context = new Context(new Sub());
        int result = context.exe(1, 2);
        System.out.println(result);
    }
}
