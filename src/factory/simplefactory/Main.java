package factory.simplefactory;

/**
 * @className: Main
 * @description: 游戏平台
 * @author: jianghs430
 * @createDate: 2020/10/21 14:41
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        GameFactory factory = new GameFactory();
        Game game = factory.create("csgo");
        game.start();
        game.play();
        game.end();
    }
}
