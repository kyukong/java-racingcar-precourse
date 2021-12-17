package racingcar.service;

import java.util.ArrayList;
import racingcar.domain.Car;

import static racingcar.type.CarFormat.*;
import static racingcar.utils.Utils.*;
import static racingcar.view.Print.*;

public class RacingGame {
	private ArrayList<Car> cars = new ArrayList<>();
	private int times = 0;
	private int maxDistance = 0;

	private void addCar(Car car) {
		this.cars.add(car);
	}

	private String[] splitCars(String cars) {
		return getTrimList(cars.split(SPLIT.getValue(), -1));
	}

	public void setCars(String stringOfCar) {
		String[] cars = splitCars(stringOfCar);

		for (String car : cars) {
			addCar(new Car(car));
		}
	}

	public void setTimes(String times) {
		this.times = Integer.parseInt(times);
	}

	public void race() {
		if (times == 0) {
			return;
		}

		for (Car car : cars) {
			move(car);
		}
		System.out.println();
		times -= 1;
		if (times != 0) {
			race();
		}
	}

	private void move(Car car) {
		car.move();
		car.showPosition();
	}

	public void win() {
		setMaxDistance();

		ArrayList<String> winners = new ArrayList<>();
		for (Car car : cars) {
			if (car.isMaxDistance(maxDistance)) {
				winners.add(car.getName());
			}
		}
		printWinners(winners);
	}

	private void setMaxDistance() {
		for (Car car : cars) {
			if (maxDistance < car.getPosition()) {
				maxDistance = car.getPosition();
			}
		}
	}
}
