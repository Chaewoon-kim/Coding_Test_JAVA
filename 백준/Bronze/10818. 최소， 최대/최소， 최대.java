import java.util.Scanner;

class Main{
    public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //정수의 개수 받아와서
        int [] numbers = new int[n]; // 그 개수만큼의 배열 생성
        for(int i = 0 ; i < n ; i++){
            numbers [i] = sc.nextInt();
        }
        int maxValue = numbers [0];
        int minValue = numbers[0];
        for(int i = 1; i < n; i++){
            if(numbers[i] > maxValue){
                maxValue = numbers[i];
            }
        }
        for(int i = 1; i < n ; i++){
            if(numbers[i] < minValue){
                minValue = numbers[i];
            }
        }
        System.out.print(minValue + " " +  maxValue);
    }
}