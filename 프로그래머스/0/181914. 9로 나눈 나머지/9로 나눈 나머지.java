class Solution {
    public int solution(String number) {
        int answer = 0;
        //1. 문자열을 문자 배열로 변환
        for(char num : number.toCharArray()){
            answer += num - '0';
        }
        //정수 answer를 9로 나눈 나머지 return
        return answer % 9;
    }
}