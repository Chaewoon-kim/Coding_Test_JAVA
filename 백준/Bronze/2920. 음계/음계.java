import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [] numArr = new int[8];
        String result = "";
        
        for(int i = 0 ; i < numArr.length ; i++){
            numArr[i] = sc.nextInt();
        }
        
        for(int i = 0 ; i < numArr.length - 1; i++){
            if(numArr[i+1] == numArr[i] + 1){
                result = "ascending";
            }else if(numArr[i+1] == numArr[i] - 1){
                result = "descending";
            }else{
                result = "mixed";
                break;
            }
        }
        System.out.println(result);
    }
}