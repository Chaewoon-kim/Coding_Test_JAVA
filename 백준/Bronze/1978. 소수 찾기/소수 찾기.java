import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0; 
        int num = sc.nextInt(); 
        int[] numArr = new int[num];

        // 배열에 담을 숫자 입력
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
        }

        for (int i = 0; i < numArr.length; i++) {
            int n = numArr[i];
            if (n >= 2) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(n); j++) {
                    if (n % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
