import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		//받을 잔돈에 포함된 잔돈의 개수를 구하는 프로그램

		//입력: 1000엔 지폐 한 장
        Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int count = 0;

		//처리: 지불해야 할 돈 
		int payMoney = 1000 - input;

		while(payMoney > 0){
			if(payMoney / 500 != 0){
				count++;
				payMoney -= 500;
			} else if(payMoney / 100 != 0){
				count++;
				payMoney -= 100;
			}else if(payMoney / 50 != 0){
				count++;
				payMoney -= 50;
			}else if(payMoney / 10 != 0){
				count++;
				payMoney -= 10;
			}else if(payMoney / 5 != 0){
				count++;
				payMoney -= 5;
			}else if(payMoney / 1 != 0){
				count++;
				payMoney -= 1;
			}else break;
		}

		//출력: 잔돈의 개수 
		System.out.println(count);
	}

}
