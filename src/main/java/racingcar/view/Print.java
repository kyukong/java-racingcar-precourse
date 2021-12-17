package racingcar.view;

import racingcar.type.CarFormat;

public class Print {
	private static final String ERROR_PREFIX = "[ERROR] ";
	private static final String WRITE_CARS = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private static final String WRITE_TIMES = "시도할 회수는 몇회인가요?";

	public static void printErrorMessage(Exception error) {
		System.out.println(ERROR_PREFIX + error.getMessage());
	}

	public static void printWriteCars() {
		System.out.println(WRITE_CARS);
	}

	public static void printWriteTimes() {
		System.out.println(WRITE_TIMES);
	}

	public static void printPosition(String name, int position) {
		String print = name + " : ";
		for (int i = 0; i < position; i++) {
			print += CarFormat.POSITION.getValue();
		}
		System.out.println(print);
	}
}
