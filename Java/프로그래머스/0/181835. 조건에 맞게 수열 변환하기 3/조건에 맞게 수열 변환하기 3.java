class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        if(k % 2 == 1){
            for(int i = 0; i < arr.length; i++){
                answer[i] = k * arr[i];
            }
        }else if(k % 2 == 0){
            for(int i = 0 ; i < arr.length; i++){
                answer [i] = k + arr[i];
            }
        }
        return answer;
    }
    
}