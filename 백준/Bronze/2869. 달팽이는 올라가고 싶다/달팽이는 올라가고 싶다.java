import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        
        int height = A - B;
        int days = (V - A) / height;
        
        if((V-A) % height > 0){
            days++;
        }
        //마지막 날
        days++;
        
        System.out.println(days);
    }
}