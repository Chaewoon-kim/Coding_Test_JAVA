import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] size = new int[6]; //6가지의 사이즈

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            size[i] = Integer.parseInt(st.nextToken()); //사이즈별 참가자 수
        }

        st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken()); //티셔츠
        int P = Integer.parseInt(st.nextToken()); //펜 묶음 수

        int tCount = 0;
        for (int i = 0; i < size.length; i++) {
            tCount += size[i] / T;
            //묶음 수가 정확히 떨어지지 않을 경우 한 묶음 추가 구매
            if(size[i] % T > 0){
                tCount += 1;
            }
        }

        System.out.println(tCount);
        System.out.println(N/P + " " + N % P);
    }
}
