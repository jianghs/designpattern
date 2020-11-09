package factory.abstractfactory;

import factory.abstractfactory.game.Game;
import factory.abstractfactory.software.SoftWare;

/**
 * @className: AbstractFactory
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/10/21 15:58
 * @version: 1.0
 */
public abstract class AbstractFactory {
    /**
     * 创建游戏
     * @param
     * @return
     */
    public abstract Game createGame();

    /**
     * 创建软件
     * @param
     * @return
     */
    public abstract SoftWare createSoftWare();
}
