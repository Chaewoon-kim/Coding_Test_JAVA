class Solution {
    public int[] solution(int n, int[] numlist) {
        //새로운 배열 생성
          int a = 0;
            for(int i=0;i<numlist.length;i++){
                if(numlist[i]%n==0){
                a++;
            }
        }
        
        int [] answer = new int[a];
        int k = 0;
        for(int i = 0 ; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                answer[k] = numlist[i];
                k++;
            }
        }
        
        return answer;
    }
}