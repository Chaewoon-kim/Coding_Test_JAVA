import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    
    public static void main(String [] args) throws IOException{
        //ROT13 => 알파벳을 13글자씩 밀어서 만든다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		//알파벳이 아닌 글자는 그대로 남아 있어야 함 
		for(int i = 0 ; i < input.length(); i++){
			char c = input.charAt(i);
			
			if(c >= 'A' && c <= 'Z'){
				c += 13;
				if(c > 'Z') c -= 26;
			}
			else if(c >= 'a' && c <= 'z'){
				c += 13;
				if(c > 'z') c -= 26;
			}
			System.out.print(c);
		}
        
    }
}