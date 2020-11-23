package abstractfactory;

import abstractfactory.game.Game;
import abstractfactory.game.impl.FpsGame;
import abstractfactory.software.SoftWare;
import abstractfactory.software.impl.QQ;

/**
 * @className: Tencent
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/11/9 13:26
 * @version: 1.0
 */
public class Tencent extends AbstractFactory {
    @Override
    public Game createGame() {
        return new FpsGame();
    }

    @Override
    public SoftWare createSoftWare() {
        return new QQ();
    }
}
