class Solution {
    public int[] solution(int[] arr) {
          if (arr == null || arr.length == 0) {
            return new int[0];
        }
        int[] answer = new int[arr.length];
        // 1. 각 원소에 대해 값이 50보다 크거나 같은 짝수 
            for(int i = 0; i < arr.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                answer[i] = arr[i] / 2 ; 
            }
                //2. 50보다ㅏ 작은 홀수일 경우
                else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    answer[i] = arr[i] * 2;
                }else{
                    answer[i] = arr[i];
                }
           
            }
        return answer;
    }
}