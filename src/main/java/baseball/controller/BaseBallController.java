package baseball.controller;


import baseball.domain.Judge;
import baseball.domain.Playagain;
import baseball.domain.RandomNumber;
import baseball.view.Input;
import baseball.view.RestartInput;

import java.util.List;

public class BaseBallController {
    private RandomNumber randomNumber;
    private Input input;
    private RestartInput restartInput;
    private Judge judge;
    private List<Integer> computer;
    private String result;


    public BaseBallController() {
        randomNumber = new RandomNumber();
        restartInput = new RestartInput();
        input = new Input();
        judge = new Judge();
        result = null;
    }

    public void start() {
        computer = randomNumber.create();

        do {
            result = judge.judge(computer, input.playerNumber().getNumbers());
            System.out.println(result);
        } while (isGameSet());
    }

    public boolean isGameSet() {

        if (result.equals("3스트라이크")) {
            computer = randomNumber.create();
            Playagain playagain = restartInput.playAgainCheck();
            return playagain.shouldPlayAgain();
        }
        return true;
    }
}
