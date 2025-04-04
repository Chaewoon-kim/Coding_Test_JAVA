import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt(); //5 12 7 10 9 1 2 3 11
        }
        int X = sc.nextInt(); //X가 주어짐 ex:13

        boolean[] exists = new boolean[1_000_001];
        for (int i = 0; i < N; i++) {
            exists[numbers[i]] = true;
        }

        int answer = 0;
        for (int i = 1; i <= (X - 1) / 2 ; i++) {
            if (i <= 1_000_000 && X - i <= 1_000_000) {
                answer += (exists[i] && exists[X - i]) ? 1 : 0;
            }
        }
        System.out.println(answer);


    }
}
