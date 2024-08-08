import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int result1 = A + B - C;
        
        String strA = String.valueOf(A);
        String strB = String.valueOf(B);
        String strC = String.valueOf(C);
        
        int result2 = Integer.parseInt(strA + strB) - Integer.parseInt(strC);
        System.out.println(result1);
        System.out.println(result2);
    }
}