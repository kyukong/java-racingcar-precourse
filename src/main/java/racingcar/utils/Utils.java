package racingcar.utils;

public class Utils {

	public static String[] getTrimList(String[] list) {
		for (int i = 0; i < list.length; i++) {
			list[i] = list[i].trim();
		}
		return list;
	}
}
