import java.util.HashMap;


class Solution {
    public int[] solution(int N, int[] stages) {
        int [] challenger = new int[N + 2];
        for(int i =  0 ; i < stages.length ; i++){
            challenger[stages[i]] += 1;
        }
        
        HashMap<Integer , Double > failures = new HashMap<>();
        double total = stages.length;
        
        //각 스테이지 순회하며 , 실패율 계산 
        for(int i = 1; i <= N; i++){
            if(challenger[i] == 0){
                failures.put(i , 0.);
            }else{
                failures.put(i , challenger[i] / total);
                total -= challenger[i];
            }
        }
        
        return failures.entrySet().stream().sorted((o1, o2) -> Double.compare(o2.getValue(), o1.getValue())).
            mapToInt(HashMap.Entry:: getKey).toArray();
    }
}