package factory.simplefactory;

/**
 * @className: GameFactory
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/10/21 14:39
 * @version: 1.0
 */
public class GameFactory {
    public Game create(String type) {
        if("warcraft".equals(type)) {
            return new WarCraft();
        } else if("dota".equals(type)) {
            return new Dota();
        } else if("csgo".equals(type)) {
            return new CsGo();
        } else {
            return null;
        }
    }
}
