import java.util.Scanner;

class Main {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int sum = 0;
        int max = a;
        
        if(a == b && b == c) {
            sum = 10000 + a * 1000;
        } else if(a == b || b == c || a == c) {
            // 같은 눈이 두 개일 때
            if (a == b || a == c) {
                sum = 1000 + a * 100;
            } else {
                sum = 1000 + b * 100;
            }
        } else {
            // 모두 다른 눈이 나올 때
            if(b > max) {
                max = b;
            }
            if(c > max) {
                max = c;
            }
            sum = max * 100;
        }
        
        System.out.println(sum);
    }
}
