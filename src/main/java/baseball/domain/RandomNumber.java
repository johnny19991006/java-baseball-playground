package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumber {
    public int randomMake() {
        Random random = new Random();
        return random.nextInt(8) + 1;
    }

    public List<Integer> create() {
        List<Integer> computerNumber = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int randomNumber = randomMake();
            if (!(computerNumber.contains(randomNumber))) {
                computerNumber.add(randomNumber);
                continue;
            }
            i--;
        }
        return computerNumber;
    }
}