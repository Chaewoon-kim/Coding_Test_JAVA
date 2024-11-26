import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int number = sc.nextInt();
            if(number == 0){
                break;
            }
            String s = String.valueOf(number);
            String s1 = new StringBuilder().append(s).reverse().toString();
            
            if(s.equals(s1)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}