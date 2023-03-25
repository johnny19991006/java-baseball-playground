package baseball;

import baseball.domain.Judge;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class JudgeTest {
    private Judge judge = new Judge();

    @ParameterizedTest
    @DisplayName("숫자야구심판")
    @MethodSource("provideBallCheckData")
    void ballcheck(List<Integer> userNumberList, List<Integer> computerNumberList, String expected) {
        // when
        String result = judge.judge(userNumberList, computerNumberList);

        // then
        assertThat(result).isEqualTo(expected);
    }

    private static Stream<Arguments> provideBallCheckData() {
        return Stream.of(
                Arguments.of(Arrays.asList(2, 3, 7), Arrays.asList(3, 1, 2), "2볼"),
                Arguments.of(Arrays.asList(2, 1, 3), Arrays.asList(3, 1, 2), "2볼1스트라이크"),
                Arguments.of(Arrays.asList(2, 1, 3), Arrays.asList(4, 5, 7), "낫씽"),
                Arguments.of(Arrays.asList(1,2,3),Arrays.asList(1,2,3), "3스트라이크"),
                Arguments.of(Arrays.asList(1,2,5),Arrays.asList(1,2,6), "2스트라이크")
        );
    }

}