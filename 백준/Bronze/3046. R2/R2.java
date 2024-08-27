import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int avg = sc.nextInt();
        
        int r2 = 2 * avg - r1;
        System.out.println(r2);
    }
}