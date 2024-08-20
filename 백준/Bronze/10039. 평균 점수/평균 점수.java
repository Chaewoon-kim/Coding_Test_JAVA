import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        int [] scores = new int[5];
        for(int i = 0 ; i < scores.length; i++){
            scores[i] = sc.nextInt();
            if(scores[i] >=40){
                sum += scores[i];
            }else if(scores[i] < 40){
                sum += 40;
            }
        }
        avg = sum / 5;
        System.out.println(avg);
    }
}