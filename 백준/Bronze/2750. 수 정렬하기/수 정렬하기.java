import java.util.*;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        //입력받을 숫자의 개수
        int N = sc.nextInt();
        //N 크기의 배열 생성
        int [] numArr = new int [N];
        for(int i = 0 ; i < numArr.length; i++){
            numArr[i] = sc.nextInt(); //각 인덱스 별로 숫자 입력 받기
        }
        Arrays.sort(numArr);
        
        //정렬 후 배열의 각 인덱스 출력
        for(int i = 0 ; i < numArr.length; i++){
            System.out.println(numArr[i]);
        }
    }
}