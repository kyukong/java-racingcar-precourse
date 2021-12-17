package racingcar;

import racingcar.controller.RacingGameController;
import racingcar.service.RacingGame;

public class Application {
    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        RacingGameController controller = new RacingGameController(racingGame);
        controller.start();
    }
}
