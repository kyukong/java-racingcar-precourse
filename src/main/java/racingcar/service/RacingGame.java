package racingcar.service;

import java.util.ArrayList;
import racingcar.domain.Car;

import static racingcar.type.CarFormat.*;

public class RacingGame {
	private ArrayList<Car> cars = new ArrayList<>();
	private int times = 0;

	public void setCars(String stringOfCar) {
		String[] cars = splitCars(stringOfCar);

		for (String car : cars) {
			addCar(new Car(car));
		}
	}

	private String[] splitCars(String cars) {
		return cars.split(SPLIT.getValue());
	}

	private void addCar(Car car) {
		this.cars.add(car);
	}
}
