package racingcar.view;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static racingcar.validator.Validator.*;

public class Input {
	public static String inputCars() {
		String input = readLine();
		if (!isValidatedCars(input)) {
			input = inputCars();
		}

		return input;
	}

	public static String inputTimes() {
		String input = readLine();
		if (!isValidatedTimes(input)) {
			input = inputTimes();
		}

		return input;
	}
}
