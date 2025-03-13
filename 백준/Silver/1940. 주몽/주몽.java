import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {

        //투 포인터 사용하는 문제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int [] ingredients = new int[N];
        StringTokenizer st =  new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            ingredients[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ingredients); //배열 오름차순 정렬
        int count = 0;
        int start_index = 0; //min
        int end_index = N - 1; //max

        while(start_index < end_index){
            if(ingredients[start_index] + ingredients[end_index] < M){
                start_index ++;
            }else if(ingredients[start_index] + ingredients[end_index] > M){
                end_index --;
            }else/*start_index + end_index == M */ {
                count++;
                start_index++;
                end_index--;
            }
        }
        System.out.println(count);
    }
}
