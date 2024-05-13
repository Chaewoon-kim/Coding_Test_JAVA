class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        int[] answer = new int[num2 - num1 + 1]; //  새로운 배열의 크기
        for(int i = num1 ; i <= num2 ;i++){
            answer[i - num1] /*배열의 첫번째 인덱스*/ = numbers[i];
        }
        return answer;
    }
}