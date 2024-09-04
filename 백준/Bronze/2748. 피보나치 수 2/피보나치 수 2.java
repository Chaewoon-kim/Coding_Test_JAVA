import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long [] numArr = new long[91];
        numArr[0] = 0;
        numArr[1] = 1;
        
        for(int i = 2 ; i <= n ; i++){
            numArr[i] = numArr[i-1] + numArr[i-2];
        }
        System.out.println(numArr[n]);
    }
}
