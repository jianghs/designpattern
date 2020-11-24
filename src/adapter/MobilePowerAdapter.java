package adapter;

/**
 * @className: MobilePowerAdapter
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/11/24 13:18
 * @version: 1.0
 */
public class MobilePowerAdapter implements PowerI {
    private CnPower cnPower;

    public MobilePowerAdapter(CnPower cnPower) {
        this.cnPower = cnPower;
    }

    @Override
    public int provide() {
        int power = cnPower.provide();
        // 经过适配
        return 110;
    }
}
