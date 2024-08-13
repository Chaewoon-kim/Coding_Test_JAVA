import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0 ; i < num ; i++){
            String result = sc.nextLine();
            int score = 0;
            int numO = 0;
            
            for(int j = 0 ; j < result.length() ; j++){
                if(result.charAt(j) == 'O'){
                    numO++;
                    score += numO;
                }else{
                    numO = 0;
                }
            }
            System.out.println(score);
        }
    }
}