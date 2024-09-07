import java.util.*;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); //바구니 갯수
        int M = sc.nextInt(); //공 변경 횟수
        
        int [] buckets = new int[N];
        for(int i = 0 ; i < N; i++){
            buckets[i] = i + 1; //공의 번호는 1번부터.
        }
        
        //공 변경
        for(int i = 0; i < M; i++){
            int bucket1 = sc.nextInt() - 1; //바구니 번호는 0번부터 시작
            int bucket2 = sc.nextInt() - 1;
            
            int tmp = buckets[bucket1];
            buckets[bucket1] = buckets[bucket2];
            buckets[bucket2] = tmp;
        }
        
        //최종 바구니 출력
        for(int i = 0 ; i < N ; i++){
            System.out.print(buckets[i] + " ");
        }
    }
}