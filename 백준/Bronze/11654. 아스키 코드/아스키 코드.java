import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        
        //아스키 코드 값으로 변경
        int inputAscii = (int)input;
        System.out.println(inputAscii);
        
    }
}