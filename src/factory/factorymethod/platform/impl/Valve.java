package factory.factorymethod.platform.impl;

import factory.factorymethod.game.*;
import factory.factorymethod.game.impl.CsGo;
import factory.factorymethod.game.impl.Dota;
import factory.factorymethod.platform.GamePlatform;

/**
 * @className: Valve
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/10/21 14:52
 * @version: 1.0
 */
public class Valve extends GamePlatform {
    @Override
    public Game createGame(String type) {
        if("dota".equals(type)) {
            return new Dota();
        } else if("csgo".equals(type)) {
            return new CsGo();
        } else {
            return null;
        }
    }
}
