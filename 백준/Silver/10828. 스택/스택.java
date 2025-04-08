import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Deque<Integer> stack = new ArrayDeque<>();

        int N = sc.nextInt(); //명령의 수 N
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String command = sc.nextLine();

            if (command.startsWith("push")){
                String[] parts = command.split(" ");
                int value = Integer.parseInt(parts[1]); //숫자 값만을 분리해 스택에 push 
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
