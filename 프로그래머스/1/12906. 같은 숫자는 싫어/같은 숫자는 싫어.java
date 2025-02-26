import java.util.*;

public class Solution {
    public Stack solution(int []arr) {
        
        Stack <Integer> integerStack = new Stack<>();
        
        for(int num : arr){
            if(integerStack.isEmpty() || integerStack.peek() != num){
                integerStack.push(num);
            }
        }
        
      
        

        return integerStack;
    }
}