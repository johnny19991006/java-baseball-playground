package baseball.domain;

import java.io.*;
import java.util.Scanner;

public class Playagain {
    private final int inputAgain;

    public Playagain(int inputAgain) {
        playAgainValidator(inputAgain);
        this.inputAgain = inputAgain;
    }

    private void playAgainValidator(int input) {
        if (input != 1 && input != 2) {
            throw new IllegalArgumentException();
        }
    }

    public boolean shouldPlayAgain() {
        return inputAgain == 1;
    }

}