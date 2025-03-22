import java.util.*;
import java.io.*;

class Main{
    public static void main(String[]args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String [] words = new String[N];
        
        for(int i = 0 ; i < N ; i++){
            words[i] = br.readLine();
        }
        
        Arrays.sort(words , new Comparator<String>(){
            
            @Override
            public int compare(String s1 , String s2){
                
                //단어 길이가 같을 경우
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                }else{
                    return s1.length() - s2.length();
                }
            }
        });
        
        StringBuilder sb = new StringBuilder();
        //중복 제거를 위해 첫 번째 단어 먼저 추가
        sb.append(words[0]).append('\n');
        
        for(int i = 1; i < N ; i++){
            if(!words[i].equals(words[i - 1])){
                sb.append(words[i]).append('\n');
            }
        }
        System.out.println(sb);
    }
}