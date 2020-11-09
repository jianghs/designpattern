package factory.abstractfactory.game;

/**
 * @className: Game
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/10/21 14:28
 * @version: 1.0
 */
public class Game {

    protected String name;

    /**
     * 立项
     */
    public void start() {
        System.out.println(name + "立项");
    }

    /**
     * 开发
     */
    public void develop() {
        System.out.println(name + "开发");
    }

    /**
     * 上线
     */
    public void online() {
        System.out.println(name + "上线");
    }
}
