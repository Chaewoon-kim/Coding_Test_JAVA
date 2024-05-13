class Solution {
    public int solution(int n, int t) {
        // 1시간에 2배만큼 증식 -> t시간에 2^t 만큼 증식.
        return n * (int)Math.pow(2,t);
        
    }
}