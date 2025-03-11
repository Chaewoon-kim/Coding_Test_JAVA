import java.util.*;
import java.io.*;

class Main{
    
    public static void main(String[]args) throws IOException{
        
         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader
                (System.in));
         StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int cntNum = Integer.parseInt(stringTokenizer.nextToken()); //숫자 개수
        int qNum = Integer.parseInt(stringTokenizer.nextToken()); //질의 개수

        long [] S = new long[cntNum + 1]; //합 배열 선언

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());



        for (int i = 1; i <= cntNum; i++) {
            S[i]  = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }


        //질의 개수 만큼 반복
        for (int j = 0; j < qNum; j++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int k = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(S[k] - S[i - 1]);
        }
    }
}