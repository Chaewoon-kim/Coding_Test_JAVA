import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //응시자 수
        int k = sc.nextInt(); //상을 받는 사람의 수

        int [] scores = new int[N];
        //응시자들의 점수 배열
        for(int i = 0 ; i < scores.length ; i++){
            scores[i] = sc.nextInt();
        }
        Arrays.sort(scores);
        System.out.println(scores[N - k]);
    }
}
