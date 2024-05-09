class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int result = 0;
        // 모든 원소들의 곱 -> answer 
        for(int i = 0 ; i < num_list.length;i++){
            answer *= num_list[i];
        }
        // 모든 원소들의 합 -> result 
        for(int j = 0; j < num_list.length; j++){
            result += num_list[j]; 
        }
        // 모든 원소들의 합의 제곱 -> result1
        int result1 = result * result;
        // 모든원소들의 곱이 모든 원소들의 합의 제곱 보다 작을 경우
        if(answer < result1)
        {
            return 1; 
        }
        return 0;
        
    }
}
