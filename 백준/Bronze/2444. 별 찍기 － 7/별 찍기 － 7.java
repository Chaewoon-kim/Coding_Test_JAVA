import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        //1. 점점 증가하는 삼각형 
        for(int i = 1 ; i <= N ; i++){
            for(int j = 1 ; j <= N - i ; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2. 점점 감소하는 삼각형
        for(int i = N - 1; i >= 1; i-- ){
            for(int j = 1 ; j <= N - i ; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i -1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}