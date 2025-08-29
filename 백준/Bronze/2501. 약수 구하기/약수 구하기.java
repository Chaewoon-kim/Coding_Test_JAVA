import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException  {

		/*첫째 줄에 N의 약수들 중 K번째로 작은 수를 출력한다. 만일 N의 약수의 개수가 K개보다 적어서 K번째 약수가 존재하지 않을 경우에는 0을 출력하시오*/

				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				int N = Integer.parseInt(st.nextToken());
				int K = Integer.parseInt(st.nextToken());
				
				ArrayList<Integer> list = new ArrayList<>();
				
				for(int i = 1; i <= N; i++){
					if(N % i == 0) list.add(i);
				}
				
				if(K <= list.size()) System.out.println(list.get(K - 1));
				else{
					System.out.println(0);
				}
				


	}

}
