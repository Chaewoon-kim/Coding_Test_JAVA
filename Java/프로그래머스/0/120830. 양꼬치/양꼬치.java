class Solution {
    public int solution(int n, int k) {
        int answer = (n * 12000) + (k * 2000) /* 양꼬치 + 음료수*/ -(n / 10)*2000 ;
        return answer;
    }
}