import java.io.*;
import java.util.*;

class Main{
    public static void main(String [] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            //절댓값 작은 데이터 우선
            int first_num = Math.abs(o1);
            int second_num = Math.abs(o2);

            //절댓값이 같을 경우 -> 음수 우선 출력
            if(first_num == second_num){
                return o1 > o2 ? 1 : -1;
            }
            return first_num - second_num;
        });

        for (int i = 0; i < N; i++) {
            int req = Integer.parseInt(br.readLine());
            if (req == 0) {
                if (queue.isEmpty()) {
                    System.out.println("0");
                }else{
                    System.out.println(queue.poll());
                }
            }else{
                queue.add(req);
            }
        }
    }
}