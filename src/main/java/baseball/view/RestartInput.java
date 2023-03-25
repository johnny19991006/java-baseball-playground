package baseball.view;

import baseball.domain.Playagain;

import java.util.Scanner;

import static baseball.utils.InputMessage.*;

public class RestartInput {


    Scanner sc = new Scanner(System.in);

    public Playagain playAgainCheck() {
        System.out.println(RESTART_MESSAGE.getMessage());
        int inputAgain = sc.nextInt();
        return new Playagain(inputAgain);
    }
}
