class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        // 반복문으로 배열의 원소들을 출력해 n과 값 비교.
        for(int i : array){
            if( i == n){
                answer++;
            }
        }
        return answer;
    }
        
}
