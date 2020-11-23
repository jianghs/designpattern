package abstractfactory;

import abstractfactory.game.Game;
import abstractfactory.software.SoftWare;

/**
 * @className: Main
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/10/21 14:58
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new Tencent();
        Game game = factory.createGame();
        game.start();
        game.develop();
        game.online();

        SoftWare softWare = factory.createSoftWare();
        softWare.show();

    }
}
