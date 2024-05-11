class Solution {
    public int[] solution(int money) {
        int max = 0;
        int left = 0;
        max = money / 5500 ; 
        left = money - (max * 5500) ;
        int [] answer = {max,left};
        return answer;
    }
}