import java.util.*;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int [] nums = {A,B,C};
        
         Arrays.sort(nums);
        System.out.println(nums[1]);
    }
}