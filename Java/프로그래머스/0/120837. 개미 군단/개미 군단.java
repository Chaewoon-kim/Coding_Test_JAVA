class Solution {
    public int solution(int hp) {
        int answer = (hp/5)/*장군개미 수 */
            + (hp % 5 / 3)/*병정개미 수 */ 
            + (hp % 5 % 3 / 1)/*일개미 수*/;
        return answer;
    }
}