package racingcar.view;

public class Print {
	private static final String ERROR_PREFIX = "[ERROR] ";
	private static final String WRITE_CARS = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";

	public static void printErrorMessage(Exception error) {
		System.out.println(ERROR_PREFIX + error.getMessage());
	}

	public static void printWriteCars() {
		System.out.println(WRITE_CARS);
	}
}
