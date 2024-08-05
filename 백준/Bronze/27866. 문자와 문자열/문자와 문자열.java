import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String a1 = sc.next();
        int n = sc.nextInt();
        System.out.println(a1.charAt(n-1));
    }
}