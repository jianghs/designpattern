package adapter;

/**
 * @className: Mobile
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/11/24 13:08
 * @version: 1.0
 */
public class Mobile {
    int powerStandard = 110;
    public void charge(PowerI power) {
        if (powerStandard == power.provide()) {
            System.out.println("充电成功...");
        } else {
            System.out.println("无法适配...");
        }
    }
}
