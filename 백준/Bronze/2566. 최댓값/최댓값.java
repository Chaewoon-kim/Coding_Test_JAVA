import java.util.*;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int[][] numArr = new int[9][9];
        int max = numArr[0][0];
        int maxRow = 0;
        int maxCol = 0;
        
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                numArr[i][j] = sc.nextInt();
                if(numArr[i][j] > max){
                    max = numArr[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println(max);
        System.out.print((maxRow + 1) + " " + (maxCol + 1));
    }
}