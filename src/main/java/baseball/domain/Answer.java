package baseball.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static baseball.utils.ExceptionMessage.*;

public class Answer {

    private static final int ANSWER_DEFAULT_SIZE = 3;
    private static final int MIN_BALL_SIZE = 1;
    private static final int MAX_BALL_SIZE = 9;
    private final List<Integer> numbers;

    public Answer(List<Integer> numbers) {
        validateAnswer(numbers);
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return this.numbers;
    }

    private List<Integer> validateAnswer(List<Integer> numbers) {
        List<Integer> playerNum = new ArrayList<>();
        if (AgainSize(numbers)) {
            throw new IllegalArgumentException(INPUT_ERROR_SIZE.getMessage());
        }
        if (AgainNumber(numbers)) {
            throw new IllegalArgumentException(INPUT_ERROR_AGAIN.getMessage());
        }
        if (AgainRange(numbers)) {
            throw new IllegalArgumentException(INPUT_ERROR_RANGE.getMessage());
        }

        for (Integer number : numbers) {
            playerNum.add(number);
        }
        return playerNum;
    }

    private boolean AgainSize(List<Integer> numbers) {
        return numbers.size() != ANSWER_DEFAULT_SIZE;
    }

    private boolean AgainNumber(List<Integer> numbers) {
        Set<Integer> duplicate = new HashSet<>(numbers);
        return duplicate.size() != numbers.size();
    }

    private boolean AgainRange(List<Integer> numbers) {
        return numbers.stream()
                .anyMatch(n -> n < MIN_BALL_SIZE || n > MAX_BALL_SIZE);
    }

}