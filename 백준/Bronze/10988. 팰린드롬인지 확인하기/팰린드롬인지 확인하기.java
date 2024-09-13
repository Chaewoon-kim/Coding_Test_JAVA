import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        int answer = 1;
        
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        for(int i = 0 ; i < str.length() / 2 ; i++){
            if(str.charAt(i) != sb.charAt(i)){
             answer = 0;   
            }
        }
        System.out.println(answer);
    }
}