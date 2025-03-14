import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        //수열
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Deque<Integer> stack = new ArrayDeque<>();
        int num = 1;
        boolean result = true;
        StringBuffer bf = new StringBuffer();
        for (int i = 0; i < A.length; i++) {
            int su = A[i];
                while (su >= num) {
                    stack.push(num++);
                    bf.append("+\n");
                }
                if(stack.isEmpty()) {
                    result = false;
                    break;
                }
                if(stack.pop() != su){
                    result = false;
                    break;
                }
                bf.append("-\n");
            }
        if(result){
            System.out.println(bf.toString());
        }else {
        System.out.println("NO");
        }
    }
}
