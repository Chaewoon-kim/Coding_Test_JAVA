import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        //배열 정렬
        Arrays.sort(num_list);
        //5개의 수를 담을 새로운 배열 생성
        int [] answer = new int[5];
        
        for(int i = 0; i < 5 ; i++){
            answer[i] = num_list[i];
        }
        return answer;
    }
}