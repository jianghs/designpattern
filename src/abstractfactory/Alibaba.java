package abstractfactory;

import abstractfactory.game.Game;
import abstractfactory.game.impl.RtsGame;
import abstractfactory.software.SoftWare;
import abstractfactory.software.impl.DingTalk;

/**
 * @className: Alibaba
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/11/9 13:27
 * @version: 1.0
 */
public class Alibaba extends AbstractFactory {
    @Override
    public Game createGame() {
        return new RtsGame();
    }

    @Override
    public SoftWare createSoftWare() {
        return new DingTalk();
    }
}
