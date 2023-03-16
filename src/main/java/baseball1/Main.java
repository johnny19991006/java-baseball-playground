package baseball1;



import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        RandomNum randomNum = new RandomNum();
        Input input = new Input();
        Judge judge = new Judge();
        Playagain playagain = new Playagain();
        boolean again = true;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (again){
            List<Integer> computer = randomNum.create();
            String result = "";
            while (!result.equals("3스트라이크")){
                result = judge.judgement(computer, input.playerNumber());
                bw.write(result);
                bw.newLine();
                bw.flush();
            }
            again = playagain.playagain();
        }

    }
}