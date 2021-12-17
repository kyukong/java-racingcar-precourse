package racingcar.type;

public enum TimesFormat {
	OVER(0);

	private int number;

	TimesFormat(int number) {
		this.number = number;
	}

	public int getNumber() {
		return this.number;
	}
}
