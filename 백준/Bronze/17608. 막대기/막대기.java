import java.util.*;

class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [] heights = new int[N];

        //기둥 정보 입력
        for (int i = 0; i < N; i++) {
            heights[i] = sc.nextInt();
        }

        Deque<Integer> stack = new ArrayDeque<>();
        int count = 0;

        for (int i = N - 1; i >= 0 ; i--) {
            while(!stack.isEmpty() && stack.peek() < heights[i]){
                stack.pop();
            }

            if(stack.isEmpty() || stack.peek() < heights[i]){
                count++;
            }
            stack.push(heights[i]);
        }

        System.out.println(count);
    }
}