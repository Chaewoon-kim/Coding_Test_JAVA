class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i = 0 ; i < included.length ; i++){
            if(included[i] == true){
                answer += a;   //현재 항의 값 
            }
            a += d; // 공차를 더해 다음 항의 값을 나타냄
        }
        return answer;
    }
}