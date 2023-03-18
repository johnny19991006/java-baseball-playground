package baseball1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CompareTest {
    Compare compare= new Compare();
    @Test
    @BeforeEach
    @DisplayName("숫자 비교기능 확인")
    void count() {
        assertThat(2).isEqualTo(compare.howMany(Arrays.asList(1,2,5),Arrays.asList(3,1,2)));
    }

    @Test
    @BeforeEach
    @DisplayName("스트라이크 비교기능 확인")
    void strike(){
        assertThat(1).isEqualTo(compare.countStrike(Arrays.asList(3,2,4),Arrays.asList(3,1,2)));
    }

}