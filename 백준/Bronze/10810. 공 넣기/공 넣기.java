import java.util.Arrays;
import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int [] buckets = new int[N];
        
        for(int i = 0 ; i < M ; i++){
            int I = sc.nextInt();
            int J = sc.nextInt();
            int K = sc.nextInt();
            
            for(int j = I - 1; j < J ; j++){
                buckets[j] = K;
            }
        }
        
        
        //공의 개수 출력
        for(int i = 0 ; i < N ; i++){
            System.out.print(buckets[i] + " ");
        }
       
    }
}