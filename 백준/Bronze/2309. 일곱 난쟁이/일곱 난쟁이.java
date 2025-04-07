import java.util.*;

class Main{
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        //1.난쟁이들의 키 입력 받기 + 키의 합 저장
        int [] heights = new int[9];
        int sum = 0;
        
        for(int i = 0; i < heights.length; i++){
            heights[i] = sc.nextInt();
            sum += heights[i];
        }
        
        //2. 일곱 난쟁이의 키의 합이 100이다 -> 아홉 난쟁이들 중 두 난쟁이의 키의 합을 뺀 값이 100이면 그 난쟁이들은 가짜
        
        int fake1 = -1, fake2 = -1;
        
        for(int i = 0 ; i < 8; i++){
            for(int j = i + 1; j < 9; j++){
                if(sum - (heights[i] + heights[j]) == 100){
                    fake1 = i;
                    fake2 = j;
                    break;
                }
            }
            if(fake1 != -1){
                break;
            } 
        }
        
        //3. 실제 일곱 난쟁이들의 배열
        int [] dwarfs = new int[7];
        int index = 0;
        for(int i = 0 ; i < 9 ; i++){
            if(i == fake1 || i == fake2){
                continue;
            }
            dwarfs[index++] = heights[i];
        }
        
        Arrays.sort(dwarfs);
        for(int result : dwarfs){
            System.out.println(result);
        }
    }
}