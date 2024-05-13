class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0; i < myString.length(); i++){
            char a = myString.charAt(i); // charAt() -> 문자열에서 문자 하나씩 확인하는 함수
            // 만약 소문자일 경우
            if(Character.isLowerCase(a)){
                //대문자로 변환하여 answer에 저장 
                answer += Character.toUpperCase(a);
            }else{
                answer += a;
            }
        }
        return answer;
    }
}