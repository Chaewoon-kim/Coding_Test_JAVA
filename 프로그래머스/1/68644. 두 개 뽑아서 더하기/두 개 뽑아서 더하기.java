import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>(); //중복 제거를 위한 Set
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length ; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        //Integer 타입을 int [] 배열로 전환
        return set.stream().sorted().mapToInt(Integer :: intValue).toArray();
        
    
    }
}