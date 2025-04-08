
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

//BufferedReader 활용
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> stack = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine()); //명령의 수 
        

        for (int i = 0; i < N; i++) {
            String command = br.readLine();

            if (command.startsWith("push")){
                String[] parts = command.split(" ");
                int value = Integer.parseInt(parts[1]);
                stack.push(value);
            }else if (command.startsWith("pop")){
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
            }else if(command.startsWith("size")){
                sb.append(stack.size()).append("\n");
            }else if(command.startsWith("empty")){
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            }else if(command.startsWith("top")){
                sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
            }
        }

        System.out.println(sb);
    }


}
