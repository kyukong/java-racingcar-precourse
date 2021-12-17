package racingcar.validator;

import java.util.Arrays;
import java.util.HashSet;
import racingcar.error.CarError;
import racingcar.type.CarFormat;

import static racingcar.view.Print.*;

public class Validator {
	private static final String EMPTY = "";

	public static boolean isValidatedCars(String input) {
		try {
			validateCars(input);
		} catch (IllegalArgumentException error) {
			printErrorMessage(error);
			return false;
		}
		return true;
	}

	private static void validateCars(String input) {
		validateEmpty(input, CarError.CARS_EMPTY.getError());

		String[] cars = input.split(CarFormat.SPLIT.getValue(), -1);
		for (String car : cars) {
			validateEmpty(car, CarError.CAR_EMPTY.getError());
			validateLength(car, CarError.CAR_LENGTH.getError(), CarFormat.LENGTH.getNumber());
			validateDuplicated(cars, CarError.CAR_DUPLICATED.getError());
		}
	}

	private static void validateEmpty(String input, String message) {
		if (input.equals(EMPTY)) {
			throw new IllegalArgumentException(message);
		}
	}

	private static void validateLength(String input, String message, int length) {
		if (input.length() != length) {
			throw new IllegalArgumentException(message);
		}
	}

	private static void validateDuplicated(String[] list, String message) {
		HashSet<String> notDuplicatedList = new HashSet<>(Arrays.asList(list));
		if (notDuplicatedList.size() != list.length) {
			throw new IllegalArgumentException(message);
		}
	}
}
