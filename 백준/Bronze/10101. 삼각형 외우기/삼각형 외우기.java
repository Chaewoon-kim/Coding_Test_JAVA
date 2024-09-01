import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a + b + c;
        //정삼각형
        if(a == 60 && b == 60 && c == 60){
            System.out.println("Equilateral");
        }
        //세 각의 합이 180도가 아닌 경우
        else if( sum != 180){
            System.out.println("Error");
        }
        else if(a == b || a ==c || b == c){
            System.out.println("Isosceles");
        }
        else{
            System.out.println("Scalene");
        }
    }
}

