import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        for(int i = 0 ; i < input.length() ; i += 10){
            if(i + 10 >= input.length()){
                System.out.println(input.substring(i));
            }else{
                System.out.println(input.substring(i , i + 10));
            }
        }
    }
}