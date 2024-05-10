class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        // 반복문으로 배열의 원소들을 출력해 n과 값 비교.
        for(int i = 0 ; i < array.length; i++){
            // 만약 배열의 원소가 정수 n과 값이 같다면.
            if(array[i] == n){
                answer++;
            }
        }
        return answer;
    }
}