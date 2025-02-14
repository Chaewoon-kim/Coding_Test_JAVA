import java.util.Scanner;

class Main{
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        int [] result  = new int[26];
        String input = sc.next();
        
        for(int i = 0 ; i < input.length(); i++){
            if('A' <= input.charAt(i) && input.charAt(i) <= 'Z'){
                result[input.charAt(i) - 'A']++;
            }else{
                result[input.charAt(i) - 'a']++;
            }         
        }
        
        int max = -1;
        char ch = '?';
        
        for(int i = 0; i < 26; i++){
            if(result[i] > max){
                max = result[i];
                ch = (char)(i + 65);
            }else if(result[i] == max){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}