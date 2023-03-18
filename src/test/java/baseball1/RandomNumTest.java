package baseball1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class RandomNumTest {

    @Test
    @DisplayName("랜덤 숫자 생성 테스트")
    void randomMake() {
        RandomNum randomNumTest = new RandomNum();
        List<Integer> test = randomNumTest.create();
        assertThat(3).isEqualTo(test.size());
    }

}