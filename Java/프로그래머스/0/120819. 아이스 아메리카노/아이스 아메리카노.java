class Solution {
    public int[] solution(int money) {
        int max = money / 5500 ; 
        int left = money % 5500 ;
        int [] answer = {max,left};
        return answer;
    }
}