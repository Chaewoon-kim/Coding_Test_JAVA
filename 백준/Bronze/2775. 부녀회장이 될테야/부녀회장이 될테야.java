import java.util.Scanner;

class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for(int i = 0 ; i < testCase ; i++){
            int k = sc.nextInt();
            int n = sc.nextInt();

            int [][] memo = new int[k+1][n+1];
            int result = countPeople(k, n,memo);
            System.out.println(result);

        }
    }

    static int countPeople(int k , int n,int[][]memo){
        int total = 0;
        if(k == 0){
            return n;
        }
        for(int i = 1 ; i <= n ; i++){
            total += countPeople(k-1 , i, memo);
        }
        memo[k][n] = total;
        return total;
    }
}
