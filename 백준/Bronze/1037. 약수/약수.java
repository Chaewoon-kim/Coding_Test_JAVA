import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine()); //진짜 약수의 개수 
		StringTokenizer st = new StringTokenizer(br.readLine()); //진짜 약수 
		
		List<Integer> numbers = new ArrayList<>();
		
		while(st.hasMoreTokens()){
			numbers.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(numbers);
		
		System.out.println(numbers.get(0) * numbers.get(numbers.size() - 1));
		
	}

}


