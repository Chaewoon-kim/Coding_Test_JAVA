import java.util.*;
import java.io.*;

class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] numArr = new int[N];
        for(int i = 0 ; i < N ; i++){
            numArr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(numArr);
        
        StringBuilder sb = new StringBuilder();
        for(int i : numArr){
            sb.append(i).append("\n");
        }
        System.out.println(sb.toString());
    }
}