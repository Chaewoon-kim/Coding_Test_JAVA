import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int temp = 0;

		int [] buckets = new int [N];
		//값 저장 
		for(int i = 0 ; i < N ; i++){
			buckets[i] += i + 1;
		}

		for(int i = 0 ; i < M ; i++){
			int startNum = sc.nextInt() - 1;
			int endNum = sc.nextInt() - 1;

			while(startNum < endNum){
				temp = buckets[startNum];
				buckets[startNum] = buckets[endNum];
				buckets[endNum] = temp;

				startNum ++;
				endNum --;
			}
		}

		for(int i = 0 ; i < buckets.length ; i++){
			System.out.print(buckets[i] + " ");
		}



	}
}
