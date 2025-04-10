import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        //각 수포자들의 패턴
        int [][] patterns = {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
        
        //각 수포자 당 몇 문제를 맞췄는지 담을 배열 
        int [] result = new int[3];
        
        for(int i = 0 ; i < answers.length; i++){
            for(int j = 0 ; j < patterns.length;j++){
                if(answers[i] == patterns[j][i % patterns[j].length]){
                    result[j]++;
                }
            }
        }
        
        //가장 높은 점수를 받은 사람 저장
        int maxScore = result[0];
        for(int i : result){
            if(i > maxScore){
                maxScore = i;
            }
        }
        
        //가장 높은 점수를 받은 사람이 여럿일 경우 , return 값을 오름차순으로 정렬해야 함 
        List<Integer> scoreList = new ArrayList<>();
        for(int i = 0 ; i < result.length; i++){
            if(result[i] == maxScore){
                scoreList.add(i + 1);        
            }
        }
        
        return scoreList.stream().mapToInt(Integer::intValue).toArray();
    }
}