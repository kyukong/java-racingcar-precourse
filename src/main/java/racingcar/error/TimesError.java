package racingcar.error;

import racingcar.type.TimesFormat;

public enum TimesError {
	EMPTY("시도 횟수는 빈값을 입력할 수 없습니다."),
	OVER("시도 횟수는 " + TimesFormat.OVER.getNumber() + "이상의 수여야 합니다.");

	private String error;

	TimesError(String error) {
		this.error = error;
	}

	public String getError() {
		return this.error;
	}
}
