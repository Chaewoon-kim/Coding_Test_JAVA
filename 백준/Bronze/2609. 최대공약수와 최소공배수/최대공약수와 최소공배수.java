import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        //최대 공약수
       int div = 0;
        int min = 0;
        if(num1 <= num2){
            min = num1;
        }else{
            min = num2;
        }
        
        for(int  i = 1 ; i <= min ; i++){
            if(num1 % i == 0 && num2 % i ==0){
                div = i;
            }
        }
        System.out.println(div);
        
        //최소 공배수
        int mul = num1 * num2 / div;
        System.out.println(mul);
    }
}