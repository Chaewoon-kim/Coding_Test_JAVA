import java.util.Enumeration;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //카드 갯수
        int M = sc.nextInt();

        //N개의 숫자 입력
        int [] arr  = new int[N];
        for(int i = 0 ; i < N ; i++){
            arr[i] = sc.nextInt();
        }
        int result = search(arr, N, M);
        System.out.println(result);
    }

    static int search(int [] arr , int N , int M){
        int result = 0;

        for(int i = 0 ; i < N - 2 ; i++){
            for(int j = i + 1; j < N - 1; j++){
                for(int k = j + 1 ; k < N ; k++){

                    int temp = arr[i] + arr[j] + arr[k];
                    if(M == temp){
                        return temp;
                    }

                    if(result < temp && temp < M){
                        result = temp;
                    }

                }
            }
        }
        return result;
    }
}
