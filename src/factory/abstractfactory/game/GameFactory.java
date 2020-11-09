package factory.abstractfactory.game;

import factory.abstractfactory.game.impl.FpsGame;
import factory.abstractfactory.game.impl.MobaGame;
import factory.abstractfactory.game.impl.RtsGame;

/**
 * @className: GameFactory
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/10/21 15:51
 * @version: 1.0
 */
public class GameFactory {
    public Game create(String type) {
        if("fps".equals(type)) {
            return new FpsGame();
        } else if("moba".equals(type)) {
            return new MobaGame();
        } else if("rts".equals(type)) {
            return new RtsGame();
        } else {
            return null;
        }
    }
}
