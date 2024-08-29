import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        boolean [] submitSt = new boolean[31];
        
        for(int i = 0 ; i < 28 ; i++){
            int studentNum = sc.nextInt();
            submitSt[studentNum] = true;
        }
        
        for(int i = 1 ; i <= 30; i++){
            if(!submitSt[i]){
                System.out.println(i);
            }
        }
    }
}