import java.util.Scanner;
import java.util.ArrayList;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 0 ; i < N ; i++){
            int number = sc.nextInt();
            if(number < X){
                result.add(number);
            }
        }
        for(int numbers : result){
            System.out.print(numbers + " ");
        }
    }
}