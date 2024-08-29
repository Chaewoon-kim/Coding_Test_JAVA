import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        
        for(int j = 0 ; j < 3; j ++){
            int [] yut = new int[4];
            
            for(int i = 0 ; i < 4 ; i++){
                yut[i] = sc.nextInt();
            }
            
            int count0 = 0;
            int count1 = 0;
            for(int i = 0 ; i < 4 ; i++){
                if(yut[i] == 0){
                    count0++;
                }else if(yut[i] == 1){
                    count1++;
                }
            }
            
            String result = "";
              if (count0 == 0 && count1 == 4) {
                result = "E"; 
            } else if (count0 == 1 && count1 == 3) {
                result = "A"; // 도
            } else if (count0 == 2 && count1 == 2) {
                result = "B"; // 개
            } else if (count0 == 3 && count1 == 1) {
                result = "C"; // 걸
            } else if (count0 == 4 && count1 == 0) {
                result = "D"; // 윷
            }
   
            System.out.println(result);
            
        }
    }
}