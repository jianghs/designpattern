package adapter;

/**
 * @className: Start
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/11/24 13:16
 * @version: 1.0
 */
public class Start {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        MobilePowerAdapter adapter = new MobilePowerAdapter(new CnPower());
        mobile.charge(adapter);
    }
}
