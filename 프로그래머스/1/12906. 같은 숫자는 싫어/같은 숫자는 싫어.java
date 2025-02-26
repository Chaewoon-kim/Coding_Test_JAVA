import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack <Integer> integerStack = new Stack<>();
        
        for(int num : arr){
            if(integerStack.isEmpty() || integerStack.peek() != num){
                integerStack.push(num);
            }
        }
        
        int[] answer = new int [integerStack.size()] ;
        for(int i = 0 ; i < answer.length; i++){
            answer[i] = integerStack.get(i);
        }
        

        return answer;
    }
}