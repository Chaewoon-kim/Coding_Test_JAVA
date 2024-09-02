import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //(w,h) 의 꼭짓점을 기준으로 직사각형 생성 
        // x의 최솟값 -> x or w-x 
        // y의 최솟값 -> y or h-y
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        int x_min = Math.min(x , (w-x));
        int y_min = Math.min(y , (h-y));
        
        System.out.println(Math.min(x_min , y_min));
    }
}