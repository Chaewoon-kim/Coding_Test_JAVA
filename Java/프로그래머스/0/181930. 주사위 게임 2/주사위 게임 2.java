class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        //1. 세 숫자가 모두 다를 때 
        if(a != b && b != c && a != c ){
            answer = a + b + c;
        }
        //2. 세 숫자가 모두 같을 때 
        else if(a == b && b == c){
            answer = (a + b + c) * (a*a + b*b + c*c ) * (a*a*a + b*b*b + c*c*c );
        }else
        {
            answer = (a + b + c) * (a*a + b*b + c*c );
        }
        return answer;
    }
}