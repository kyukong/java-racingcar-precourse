package racingcar.error;

public enum CarError {
	CARS_EMPTY("경주할 자동차의 이름을 입력해주세요."),
	CAR_EMPTY("자동자의 이름은 빈값이 될 수 없습니다."),
	CAR_LENGTH("자동차의 이름은 5자 이하로 작성해주세요."),
	CAR_DUPLICATED("중복된 자동차 이름이 있습니다. 중복없이 작성해주세요.");

	private String error;

	CarError(String error) {
		this.error = error;
	}

	public String getError() {
		return this.error;
	}
}
