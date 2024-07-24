class Solution {
    public int solution(int a, int b) {
        int num1 = Integer.parseInt("" + a + b); //문자열 + 정수 -> 문자열
        int num2 = 2 * a * b;
        
        int answer = 0;
        if(num1 > num2){
            answer = num1;
        }else if(num1 < num2){
            answer = num2;
        }else{
            answer = num1;
        }
        return answer;
        
        
        
    }
}