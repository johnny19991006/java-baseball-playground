package baseball1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class InputTest {

    @Test
    @DisplayName("3개의 값이 잘 들어왔는지")
    void playerNumber() {
        //given
        String userNum="123";
        //then
        assertThat(userNum.length()).isEqualTo(3);
    }
}