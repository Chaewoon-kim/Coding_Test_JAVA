import java.util.*;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int [] numArr = new int [5];
        for(int i = 0 ; i < numArr.length; i++){
            numArr[i] = sc.nextInt();
        }
        
        int sum = 0;
        for(int i : numArr){
            sum += i;
        }
        //평균
        int avg = sum / numArr.length;
        System.out.println(avg);
        
        Arrays.sort(numArr);
        //중앙값
        System.out.println(numArr[2]);
    }
}