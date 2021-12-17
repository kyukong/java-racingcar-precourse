package racingcar.controller;

import racingcar.service.RacingGame;

import static racingcar.view.Print.*;
import static racingcar.view.Input.*;

public class RacingGameController {
	private RacingGame racingGame;

	public RacingGameController(RacingGame racingGame) {
		this.racingGame = racingGame;
	}

	public void start() {
		writeCars();
		writeTimes();

		play();
	}

	private void writeCars() {
		printWriteCars();
		racingGame.setCars(inputCars());
	}

	private void writeTimes() {
		printWriteTimes();
		racingGame.setTimes(inputTimes());
	}

	private void play() {
		racingGame.race();
		racingGame.win();
	}
}
