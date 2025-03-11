import java.util.Scanner;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String numbers = sc.next();
        
        int total = 0;
        for(int i = 0 ; i < N ; i++){
            total += numbers.charAt(i) - 48;
        }
        System.out.println(total);
    }
}