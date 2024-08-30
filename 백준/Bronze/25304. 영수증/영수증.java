import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int N = sc.nextInt();
        int [] total = new int[N];
        for(int i = 0 ; i < N; i ++){
            int a  = sc.nextInt();
            int b = sc.nextInt();
            total[i]  = a * b;
        }
        int sum = 0;
        for(int i = 0 ; i < total.length; i++){
            sum += total[i];
        }
        if(sum == X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}