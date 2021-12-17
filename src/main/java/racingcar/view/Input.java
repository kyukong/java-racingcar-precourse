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
}
