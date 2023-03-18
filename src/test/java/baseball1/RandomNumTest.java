package baseball1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class RandomNumTest {

    @Test
    @DisplayName("랜덤 숫자 생성 테스트")
    void randomMake() {
        RandomNum randomNumTest = new RandomNum();
        List<Integer> test = randomNumTest.create();
        assertThat(3).isEqualTo(test.size());//3개인지 확인하기!!
        for (Integer number : test) {
            assertThat(number > 0 && number < 10).isEqualTo(true);//숫자가 1~9인지 확인하기!!
            assertThat(Collections.frequency(test, number)).isEqualTo(1);//1대1대응 확인하기!!
        }
    }

}