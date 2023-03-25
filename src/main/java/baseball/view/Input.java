package baseball.view;

import baseball.domain.Answer;
import baseball.domain.Playagain;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static baseball.utils.InputMessage.*;


public class Input {


    Scanner sc = new Scanner(System.in);

    public Answer playerNumber() {
        System.out.println(INPUT_MESSAGE.getMessage());
        String input = sc.nextLine();
        List<Integer> casting = parseToListInteger(input);
        return new Answer(casting);
    }

    private static List<Integer> parseToListInteger(String input) {
        return IntStream.range(0, input.length())
                .mapToObj(index -> Integer.parseInt(String.valueOf(input.charAt(index))))
                .collect(Collectors.toList());
    }

}