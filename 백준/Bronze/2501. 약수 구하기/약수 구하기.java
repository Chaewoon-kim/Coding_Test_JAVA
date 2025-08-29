import java.util.Scanner;
import java.util.ArrayList;


class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

		int number = sc.nextInt(); //N
		int count = sc.nextInt(); //K
		ArrayList<Integer> list = new ArrayList<>();

		for(int i = 1; i <= number; i++){
			if(number % i == 0){
				list.add(i);
			}
		}
		if(list.size() < count){
			System.out.println(0);
		}else{
			System.out.println(list.get(count - 1));
		}


	}
 
}