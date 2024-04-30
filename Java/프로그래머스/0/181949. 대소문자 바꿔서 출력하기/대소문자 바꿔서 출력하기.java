import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b;
        String answer = "";
        
        for(int i = 0; i < a.length() ; i++){
            b = a.charAt(i); 
            //charAt() = 문자열에서 문자 하나만 가져오는 함수
            if(Character.isUpperCase(b)){
                // b가 대문자일때 , toLowerCase() 함수 사용해 소문자로 변환
                answer+= Character.toLowerCase(b);
            }else{
                // b가 소문자일때, toUpperCase() 함수 사용해 대문자로 변환 
                answer+= Character.toUpperCase(b);
            }
        }
        System.out.print(answer);
    }
}
