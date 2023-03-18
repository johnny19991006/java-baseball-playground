package baseball1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

public class Output {
    private RandomNum randomNum;
    private Input input;
    private Judge judge;
    private Playagain playagain;
    private List<Integer> computer;
    private String result;


    public Output(){
        randomNum=new RandomNum();
        input= new Input();
        judge= new Judge();
        playagain= new Playagain();
        result=null;
    }

    public void start() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        computer = randomNum.create();

        do{
            result=judge.judgement(computer, input.playerNumber());
            bw.write(result);
            bw.newLine();
            bw.flush();
        }while(isGameSet());

    }
    public boolean isGameSet() throws IOException {

        if(result.equals("3스트라이크")){
            computer = randomNum.create();
            return playagain.playagain();
        }
        return true;
    }

}
