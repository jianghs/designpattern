package factory.simplefactory;

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
     * 开始
     */
    public void start() {
        System.out.println(name + "开始");
    }

    /**
     * 进行中
     */
    public void play() {
        System.out.println(name + "游戏中...");
    }

    /**
     * 结束
     */
    public void end() {
        System.out.println(name + "结束");
    }
}
