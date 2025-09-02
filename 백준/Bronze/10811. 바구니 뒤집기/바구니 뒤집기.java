import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int temp = 0;

		int [] bucket = new int[N];

		for(int i = 0 ; i < N ; i++){
			bucket[i] = i + 1;
		}

		for(int i = 0 ; i < M ; i++){
			st = new StringTokenizer(br.readLine(), " "); //1 2 
			int startNum = Integer.parseInt(st.nextToken()) - 1; //StringTokinzer에서 토큰을 하나 꺼냄
			int endNum = Integer.parseInt(st.nextToken()) - 1;

			while(startNum < endNum){
				temp = bucket[startNum];
				bucket[startNum] = bucket[endNum];
				bucket[endNum] = temp;

				startNum++;
				endNum--;
			}
		}
		
		for(int i = 0 ; i < bucket.length ; i++){
			System.out.print(bucket[i] + " ");
		}



	}
}
