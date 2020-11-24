package adapter;

/**
 * @className: CnPower
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/11/24 13:09
 * @version: 1.0
 */
public class CnPower implements PowerI {
    @Override
    public int provide() {
        return 220;
    }
}
