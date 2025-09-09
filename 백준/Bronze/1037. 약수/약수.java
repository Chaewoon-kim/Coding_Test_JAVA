import java.util.Arrays;
import java.util.Scanner;


class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//N의 진짜 약수의 개수 
		int Ncount = sc.nextInt();
		int [] numbers = new int [Ncount];
		
		for(int i = 0 ; i < Ncount ; i++){
			numbers[i] = sc.nextInt();
		}
		
		//배열 정렬 
		Arrays.sort(numbers);
		System.out.println(numbers[0] * numbers[Ncount - 1]);
		
		
		
		
		
		
		
	}

}


