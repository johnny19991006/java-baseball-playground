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
        bw.close();//버퍼리더,라이터를 닫아줘야 하는데, 다른 클래스에서 닫아주려면 다시 선언해주고 닫아줘야 하는데 어떤방법이 더 나은지 모르겠습니다...
        return false;
    }
}