package racingcar.service;

import java.util.ArrayList;
import racingcar.domain.Car;

import static racingcar.type.CarFormat.*;
import static racingcar.utils.Utils.*;

public class RacingGame {
	private ArrayList<Car> cars = new ArrayList<>();
	private int times = 0;

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
}
