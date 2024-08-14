import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        //N개의 과목에서 최댓값 고르기
        int [] subArr = new int[N];
        for(int i = 0 ; i < subArr.length; i++){
            subArr[i] = sc.nextInt();
        }
        
        //최댓값 구하기
        int max = subArr[0];
        for(int i = 0 ; i < subArr.length; i++){
            if(subArr[i] > max){
                max = subArr[i];
            }
        }
        //새로운 평균 
        double sum = 0;
        for(int i = 0 ; i < subArr.length; i++){
            sum += (double)subArr[i] / max * 100;
        }
        double newAvg = sum / N;
        System.out.println(newAvg);
    }
}