import java.util.Scanner;

class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        //(3)
        int mul3 = num1 * (num2 % 100 % 10);
        System.out.println(mul3);
        
        //(4)
        int mul4 = num1  * (num2 % 100 / 10);
        System.out.println(mul4);
        
        //(5)
        int mul5 = num1 * (num2 / 100);
        System.out.println(mul5);
        
        //(6)
        int mul6 = num1 * num2;
        System.out.println(mul6);
    }
}