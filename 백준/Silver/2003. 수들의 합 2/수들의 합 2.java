import java.util.Scanner;

class Main{
    
    public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] numArr = new int[N];
        for (int i = 0; i < N; i++) {
            numArr[i] = sc.nextInt();
        }

        int count = 0;
        int start_index = 0 , end_index = 0 , sum = 0;

        while(end_index <= N){
            if(sum < M){
                if(end_index == N){
                    break;
                }
                sum += numArr[end_index];
                end_index++;
            }else if(sum > M){
                sum -= numArr[start_index];
                start_index ++;
            }else {
                count++;
                sum -= numArr[start_index];
                start_index++;
            }
        }
        System.out.println(count);
    }
}