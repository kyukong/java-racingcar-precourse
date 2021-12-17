package racingcar.domain;

import racingcar.type.CarFormat;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;
import static racingcar.view.Print.*;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move() {
        int pick = pickNumberInRange(CarFormat.RANGE_START.getNumber(), CarFormat.RANGE_END.getNumber());

        if (pick >= CarFormat.MOVE.getNumber()) {
            position++;
        }
    }

    public void showPosition() {
        printPosition(this.name, this.position);
    }
}
