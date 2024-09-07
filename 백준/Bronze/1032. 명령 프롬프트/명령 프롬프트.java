import java.util.*;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        String [] files = new String[n];
        for(int i = 0 ; i < n ; i++){
            files[i] = sc.nextLine();
        }
        
        StringBuilder pattern = new StringBuilder(files[0]);
        
        for(int i = 1; i < n; i++){
            for(int j = 0; j < files[i].length(); j++){
                if(pattern.charAt(j) != files[i].charAt(j)){
                    pattern.setCharAt(j , '?');
                }
            }
        }
        
        System.out.println(pattern.toString());
    }
}