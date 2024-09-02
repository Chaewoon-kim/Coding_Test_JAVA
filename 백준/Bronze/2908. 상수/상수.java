import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        String s1 = sb.append(num1).reverse().toString();
        
        StringBuilder sb2 = new StringBuilder();
        String s2 = sb2.append(num2).reverse().toString();
        
        int reverseNum1 = Integer.parseInt(s1);
        int reverseNum2 = Integer.parseInt(s2);
        
        if(reverseNum1 > reverseNum2){
            System.out.println(reverseNum1);
        }else{
            System.out.println(reverseNum2);
        }
        
    }
}