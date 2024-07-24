class Solution {
    public int solution(int a, int b) {
        String num1 = Integer.toString(a);
        String num2 = Integer.toString(b);
        int num3 = Integer.parseInt(num1 + num2);
        int num4 = Integer.parseInt(num2 + num1);
        int answer = 0;
        if(num3 > num4){
            answer = num3;
        }else if(num3 < num4){
            answer = num4;
        }else if(num3 == num4){
            answer = num3;
        }
        return answer;
    }
}