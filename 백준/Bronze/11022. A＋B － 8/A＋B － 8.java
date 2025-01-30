import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //테스트 개수
        int totalCase = sc.nextInt();

        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= totalCase; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int sum = A + B;
            result.append(String.format("Case #%d: %d + %d = %d\n" , i , A, B, sum));
        }

        System.out.println(result.toString());
        sc.close();
    }
}