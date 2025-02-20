package racingcar;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import camp.nextstep.edu.missionutils.test.NsTest;

class ApplicationTest extends NsTest {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    private static final String ERROR_MESSAGE = "[ERROR]";

    @Test
    void 전진_정지() {
        assertRandomNumberInRangeTest(
            () -> {
                run("pobi,woni", "1");
                assertThat(output()).contains("pobi : -", "woni : ", "최종 우승자 : pobi");
            },
            MOVING_FORWARD, STOP
        );
        assertRandomNumberInRangeTest(
            () -> {
                run("1, 2, 3", "1");
                assertThat(output())
                    .contains("1 : -", "2 : ", "3 : ", "최종 우승자 : 1");
            },
            MOVING_FORWARD, STOP
        );
    }

    @Test
    void 이름에_대한_예외_처리() {
        assertSimpleTest(
            () -> {
                runException("pobi,javaji");
                assertThat(output()).contains(ERROR_MESSAGE);
            }
        );
        assertSimpleTest(
            () -> {
                runException("pobi,");
                assertThat(output()).contains(ERROR_MESSAGE);
            }
        );
    }

    @Test
    void 시도_횟수에_대한_예외_처리() {
        assertSimpleTest(
            () -> {
                runException("pobi,woni", "      ");
                assertThat(output()).contains(ERROR_MESSAGE);
            }
        );
        assertSimpleTest(
            () -> {
                runException("pobi,woni", "attempt");
                assertThat(output()).contains(ERROR_MESSAGE);
            }
        );
        assertSimpleTest(
            () -> {
                runException("pobi,woni", "-1");
                assertThat(output()).contains(ERROR_MESSAGE);
            }
        );
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
