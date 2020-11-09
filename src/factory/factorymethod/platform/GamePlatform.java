package factory.factorymethod.platform;

import factory.factorymethod.game.Game;

/**
 * @className: Main
 * @description: 游戏平台
 * @author: jianghs430
 * @createDate: 2020/10/21 14:41
 * @version: 1.0
 */
public abstract class GamePlatform {

    /**
     * 创建游戏
     * @param type
     * @return
     */
    public abstract Game createGame(String type);


}
