import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int [] numArr = {a,b,c};
        Arrays.sort(numArr);
        for(int i : numArr){
            System.out.print(i + " ");
        }
    }
}