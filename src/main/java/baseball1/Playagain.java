package baseball1;

import java.io.*;
import java.util.Scanner;

public class Playagain {
    public boolean playagain()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("축하합니다! 경기를 다시 시작하겠습니까? 다시 시작 : 1, 종료 : 2");
        bw.newLine();
        bw.flush();
        int answer = Integer.parseInt(br.readLine());
        if(answer == 1){
            return true;
        }
        br.close();
        bw.close();
        return false;
    }
}