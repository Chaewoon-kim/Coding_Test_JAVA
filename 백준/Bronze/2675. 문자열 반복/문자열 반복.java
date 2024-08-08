import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0 ; i < N ; i++){
            int R = sc.nextInt();
            String s = sc.next();
            
            StringBuilder P = new StringBuilder();
            for(char c : s.toCharArray()){
                for(int j = 0 ; j < R ; j++){
                    P.append(c);
                }
            }
            System.out.println(P.toString());
        }
    }
}