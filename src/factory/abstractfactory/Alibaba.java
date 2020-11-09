package factory.abstractfactory;

import factory.abstractfactory.game.Game;
import factory.abstractfactory.game.impl.FpsGame;
import factory.abstractfactory.game.impl.RtsGame;
import factory.abstractfactory.software.SoftWare;
import factory.abstractfactory.software.impl.DingTalk;
import factory.abstractfactory.software.impl.QQ;

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
