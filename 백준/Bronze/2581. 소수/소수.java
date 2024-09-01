import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum = 0; 
        int min = Integer.MAX_VALUE;
        
        for(int i = N ; i <= M ; i++){
            boolean isPrime = true;
            if(i <= 1){
                isPrime = false;
            }else{
                for(int j = 2; j <= Math.sqrt(i); j++){
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime){
                sum += i;
                if(i < min){
                    min = i;
                }
            }
        }
        if(sum > 0){
            System.out.println(sum);
            System.out.println(min);
        }else{
            System.out.println(-1);
        }
    }
}