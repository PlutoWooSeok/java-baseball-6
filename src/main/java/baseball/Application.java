package baseball;

import baseball.Controller.GameController;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        GameController gameController = new GameController();
        //프로그램 실행
        gameController.playGame();
    }
}
