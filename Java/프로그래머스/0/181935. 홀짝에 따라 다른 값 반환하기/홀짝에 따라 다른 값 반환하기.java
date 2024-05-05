class Solution {
    public int solution(int n) {
        int result = 0;
        for(int i = 1; i <= n ; i++){
            if(n % 2 == 1 && i % 2 == 1){
                result += i;
            }
            else if (n % 2 == 0 && i % 2 == 0){
                result += i * i;
            }
        }
        return result;
    }
}