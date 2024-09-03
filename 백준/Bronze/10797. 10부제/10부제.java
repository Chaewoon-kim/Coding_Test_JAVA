import java.util.*;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int day = sc.nextInt();
        int [] carNums = new int[5];
        int count = 0; //10부제 위반 차량의 수
        for(int i = 0 ; i < carNums.length; i++){
            carNums[i] = sc.nextInt();
            if(carNums[i] ==  day){
                count++;
            }
        }
        System.out.println(count);
    }
}