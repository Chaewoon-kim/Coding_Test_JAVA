class Solution {
    public int solution(int[] array) {
        // 배열을 오름차순으로 정렬 -> sort()
        java.util.Arrays.sort(array);
        // 중앙값 구하기 
        int answer = array [array.length/2];
        return answer;
    }
}