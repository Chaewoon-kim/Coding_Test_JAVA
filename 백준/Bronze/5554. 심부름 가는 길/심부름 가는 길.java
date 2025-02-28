import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int last = sc.nextInt();
        
        //분
        System.out.println((first+second+third+last) / 60);
        //초 
        System.out.println((first+second+third+last) % 60);
    }
    
    
}