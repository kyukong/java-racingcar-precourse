package racingcar.type;

public enum CarFormat {
	SPLIT(","),
	LENGTH(5),
	POSITION("-"),
	RANGE_START(0),
	RANGE_END(9),
	MOVE(4);

	private int number;
	private String value;

	CarFormat(int number) {
		this.number = number;
	}

	CarFormat(String value) {
		this.value = value;
	}

	public int getNumber() {
		return this.number;
	}

	public String getValue() {
		return this.value;
	}
}
