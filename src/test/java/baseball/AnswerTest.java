package baseball;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import baseball.domain.Answer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AnswerTest {

    @Test
    @DisplayName("정상적인 Answer 생성")
    void createAnswer() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        Answer answer = new Answer(numbers);
        assertEquals(numbers, answer.getNumbers());
    }

    @Test
    @DisplayName("3자리가 아닌 Answer 생성시 예외 발생")
    void createAnswerWithWrongSize() {
        List<Integer> numbers = Arrays.asList(1, 2);
        assertThrows(IllegalArgumentException.class, () -> new Answer(numbers),
                "숫자의 크기가 맞지 않을 때 예외 발생해야 함");
    }

    @Test
    @DisplayName("중복된 숫자가 있는 Answer 생성시 예외 발생")
    void createAnswerWithDuplicateNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 2);
        assertThrows(IllegalArgumentException.class, () -> new Answer(numbers),
                "중복된 숫자가 있을 때 예외 발생해야 함");
    }

    @Test
    @DisplayName("범위를 벗어난 숫자가 있는 Answer 생성시 예외 발생")
    void createAnswerWithNumbersOutOfRange() {
        List<Integer> numbers = Arrays.asList(1, 2, 10);
        assertThrows(IllegalArgumentException.class, () -> new Answer(numbers),
                "범위를 벗어난 숫자가 있을 때 예외 발생해야 함");
    }
}