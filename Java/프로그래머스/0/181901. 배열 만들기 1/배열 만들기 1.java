class Solution {
    public int[] solution(int n, int k) {
        //1. 새로운 배열 생성
        int count = 0;
        for (int i = 1; i <= n; i++) {
            // i가 k의 배수일 때 배열에 저장
            if (i % k == 0) {
                count++;
            }
        }
        //2. 배열에 k의 배수 채우기 
        int [] answer = new int[count];
        int index =  0;
        for(int i = 1 ; i <= n ; i++){
            if(i % k == 0){
                answer[index] = i; //answer의 0번째 인덱스부터 오름차순으로 정렬
                index++;
            }
        }
        return answer;
    }
}