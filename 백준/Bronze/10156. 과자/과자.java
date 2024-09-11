import java.util.Scanner;


class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        //1.과자 1개의 가격
        int K = sc.nextInt();
        
        //2.과자의 개수 N
        int N = sc.nextInt();
        
        //3. 가진 돈 
        int M = sc.nextInt();
        
        int totalPrice = K * N;
        int borrowMoney = 0;
        
        if(M < totalPrice){
            borrowMoney = totalPrice - M;
        }else{
            borrowMoney = 0;
        }
        System.out.println(borrowMoney);
        
    }
}