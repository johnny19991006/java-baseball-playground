package baseball.domain;

import java.util.List;

import static baseball.utils.OutputMessage.*;


public class Judge {
    Comparison comparison = new Comparison();


    public String judge(List<Integer> computer, List<Integer> player) {
        int total = comparison.howMany(computer, player);
        int strike = comparison.countStrike(computer, player);
        int ball = total - strike;

        if (total == 0) {
            return NOTHING.getMessage();
        }
        if (ball == 0) {
            return strike + STRIKE.getMessage();
        }
        if (strike == 0) {
            return ball + BALL.getMessage();
        }
        return ball + BALL.getMessage() + strike + STRIKE.getMessage();
    }


}