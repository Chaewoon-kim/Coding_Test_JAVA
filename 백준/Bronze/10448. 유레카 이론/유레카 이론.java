import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        preprocess();

        Scanner sc = new Scanner(System.in);
        int  T = sc.nextInt();

        while (T-- > 0) {
            int K = sc.nextInt();
            System.out.println(isEurekaNumber[K] ? "1" : "0");
        }
    }

    static boolean [] isEurekaNumber = new boolean[1001];

    public static void preprocess(){
        //1. K보다 작은 삼각수를 모두 구함
        int [] triangleNumbers = new int[50];
        int triangleNumberCount = 0;
        for (int i = 1;  ; i++) {
            int triangleNumber = i * (i + 1) / 2;
            if (triangleNumber > 1000) break;
            triangleNumbers[triangleNumberCount++] = triangleNumber;
        }

        //2. 구해진 삼각수 3개의 합으로 K를 나타낼 수 있는지
        for (int i = 0; i < triangleNumberCount; i++) {
            for (int j = i; j < triangleNumberCount; j++) {
                for (int k = j; k < triangleNumberCount; k++) {
                    int eurekaNum = triangleNumbers[i] + triangleNumbers[j] + triangleNumbers[k];
                    if (eurekaNum > 1000) break;
                    isEurekaNumber[eurekaNum] = true;
                }
            }
        }
    }
}
