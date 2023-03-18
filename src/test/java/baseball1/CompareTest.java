package baseball1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CompareTest {
    Compare compare= new Compare();

    @Test
    @DisplayName("숫자 비교기능 확인")
    void count(){

        // given
        List<Integer> userNumberList = Arrays.asList(1, 3, 5);
        List<Integer> computerNumberList = Arrays.asList(5, 2, 3);

        // when
        int sameNumberAmount = compare.howMany(userNumberList, computerNumberList);

        // then
        assertThat(sameNumberAmount).isEqualTo(2);
    }
    @Test
    @DisplayName("스트라이크 비교")
    void strike(){

        // given
        List<Integer> userNumberList = Arrays.asList(3,2,1);
        List<Integer> computerNumberList = Arrays.asList(3,1,2);

        // when
        int strikeAmount = compare.countStrike(userNumberList, computerNumberList);

        // then
        assertThat(strikeAmount).isEqualTo(1);
    }

}