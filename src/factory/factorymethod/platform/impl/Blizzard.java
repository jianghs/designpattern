package factory.factorymethod.platform.impl;

import factory.factorymethod.game.*;
import factory.factorymethod.game.impl.StarCraft;
import factory.factorymethod.game.impl.WarCraft;
import factory.factorymethod.platform.GamePlatform;

/**
 * @className: Blizzard
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/10/21 14:53
 * @version: 1.0
 */
public class Blizzard extends GamePlatform {
    @Override
    public Game createGame(String type) {
        if("warcraft".equals(type)) {
            return new WarCraft();
        } else if("starcraft".equals(type)) {
            return new StarCraft();
        } else {
            return null;
        }
    }
}
