import java.util.Scanner;

class Main{
    public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        String num = "" + (A * B * C);

        int [] countArr = new int[10];

        for(int i  = 0 ; i < num.length() ; i++){
            int digit = num.charAt(i) - '0' ; 
            countArr[digit]++;
        }

        for(int i = 0 ; i < countArr.length ; i++){
            System.out.println(countArr[i]);
        }
    }
}