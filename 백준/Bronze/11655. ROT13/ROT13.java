import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		for(int i = 0 ; i < input.length() ; i++){
			System.out.print(Rot13(input.charAt(i)));
		}


	}


	private static char Rot13(char c){

		if(c >= 'A' && c <= 'Z'){
			return (char)((c - 'A' + 13) % 26 + 'A');
		}
		if(c >= 'a' && c <= 'z'){
			return (char)((c - 'a' + 13) % 26 + 'a');
		}
		return c;
	}
}


