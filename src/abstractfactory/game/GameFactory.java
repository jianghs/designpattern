package abstractfactory.game;

import abstractfactory.game.impl.FpsGame;
import abstractfactory.game.impl.MobaGame;
import abstractfactory.game.impl.RtsGame;

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
