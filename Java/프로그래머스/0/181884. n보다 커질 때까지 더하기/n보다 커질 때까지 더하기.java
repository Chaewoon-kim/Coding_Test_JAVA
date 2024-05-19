class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int i = 0 ; i < numbers.length; i++){
            answer += numbers[i];
            // 합이 n보다 커지는 순간 탈출.
            if(answer > n){
                break;
            }
        }
        return answer;
    }
}