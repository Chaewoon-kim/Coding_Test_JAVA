import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N  = sc.nextInt();
        int K = sc.nextInt();

        int num1 = 1;
        int num2 = 1;
        int num3 = 1;

        for(int i = 1 ; i <= N-K ; i++){
            num1 *= i;
        }

        for(int i = 1; i <= N; i++){
            num2 *= i;
        }
        for(int i = 1; i <= K; i++){
            num3 *= i;
        }

        System.out.println(num2 / (num3 * num1));



    }
}
