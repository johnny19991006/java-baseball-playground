package baseball1;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class JudgeTest {
    Judge judge;

    @BeforeEach
    void setUp(){
        judge = new Judge();
    }

    @Test
    @DisplayName("2볼 작동여부")
    void ballcheck(){
        // given
        List<Integer> userNumberList = Arrays.asList(2,3,7);
        List<Integer> computerNumberList = Arrays.asList(3,1,2);

        // when
        String twoBallExpect = judge.judgement(userNumberList, computerNumberList);

        // then
        assertThat(twoBallExpect).isEqualTo("2볼");
    }

    @Test
    @DisplayName("3스트라이크 작동여부")
    void strikecheck(){
        // given
        List<Integer> userNumberList = Arrays.asList(2,3,7);
        List<Integer> computerNumberList = Arrays.asList(2,3,7);

        // when
        String threeStrikeExpect = judge.judgement(userNumberList, computerNumberList);

        // then
        assertThat(threeStrikeExpect).isEqualTo("3스트라이크");
    }
    @Test
    @DisplayName("1스트라이크 1볼 작동여부")
    void strikeballcheck(){
        // given
        List<Integer> userNumberList = Arrays.asList(2,1,3);
        List<Integer> computerNumberList = Arrays.asList(2,3,7);

        // when
        String oneStrikeOneBallExpect = judge.judgement(userNumberList, computerNumberList);

        // then
        assertThat(oneStrikeOneBallExpect).isEqualTo("1볼 1스트라이크");
    }
    @Test
    @DisplayName("낫싱 작동여부")
    void nothing(){
        // given
        List<Integer> userNumberList = Arrays.asList(2,1,3);
        List<Integer> computerNumberList = Arrays.asList(4,5,7);

        // when
        String notThingExpect = judge.judgement(userNumberList, computerNumberList);

        // then
        assertThat(notThingExpect).isEqualTo("낫싱");

    }

}