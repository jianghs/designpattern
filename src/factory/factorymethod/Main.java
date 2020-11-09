package factory.factorymethod;

import factory.factorymethod.game.Game;
import factory.factorymethod.platform.GamePlatform;
import factory.factorymethod.platform.impl.Blizzard;
import factory.factorymethod.platform.impl.Valve;

/**
 * @className: Main
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/10/21 14:58
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        GamePlatform blizzard = new Blizzard();
        GamePlatform valve = new Valve();
        Game game = blizzard.createGame("warcraft");
        game.start();
        game.play();
        game.end();

        Game game1 = valve.createGame("dota");
        game1.start();
        game1.play();
        game1.end();
    }
}
