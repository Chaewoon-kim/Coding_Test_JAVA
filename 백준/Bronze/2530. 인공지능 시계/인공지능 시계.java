import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = sc.nextInt();

        b += d / 60;
        c += d % 60;

        b += c / 60;
        c = c % 60;

        a += b / 60;
        b = b % 60;

        a = a % 24;

        System.out.println(a + " " + b + " " + c);
    }
}
