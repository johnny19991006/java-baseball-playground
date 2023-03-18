package baseball1;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    public List<Integer> playerNumber()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("숫자를 입력하시오");
        bw.newLine();
        bw.flush();
        List<Integer> playerNum = new ArrayList<>();
        String input= br.readLine();

        for(String number: input.split("")){
            playerNum.add(Integer.parseInt(number));
        }
        return playerNum;
    }
}