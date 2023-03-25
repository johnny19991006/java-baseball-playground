package baseball;

import baseball.domain.Comparison;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ComparisonTest {
    Comparison comparison = new Comparison();

    @Test
    @DisplayName("숫자 비교기능 확인(간단확인)")
    void count() {

        // given
        List<Integer> userNumberList = Arrays.asList(1, 3, 5);
        List<Integer> computerNumberList = Arrays.asList(5, 2, 3);

        // when
        int sameNumberAmount = comparison.howMany(userNumberList, computerNumberList);

        // then
        assertThat(sameNumberAmount).isEqualTo(2);
    }

}