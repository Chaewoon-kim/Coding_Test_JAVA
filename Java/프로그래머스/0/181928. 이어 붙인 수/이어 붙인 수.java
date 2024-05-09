class Solution {
    public int solution(int[] num_list) {
        StringBuilder oddNumbers = new StringBuilder();
        StringBuilder evenNumbers = new StringBuilder();

        // 홀수와 짝수를 각각 이어붙임
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 1){
                oddNumbers.append(num_list[i]);
            } else {
                evenNumbers.append(num_list[i]);
            }
        }

        // 홀수와 짝수를 숫자로 변환하여 더함
        int result1 = Integer.parseInt(oddNumbers.toString());
        int result2 = Integer.parseInt(evenNumbers.toString());
        int answer = result1 + result2;

        return answer;
    }
}
