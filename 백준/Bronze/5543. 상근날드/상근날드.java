import java.util.*;

class Main{
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //햄버거 3종류와 음료 2종류 , 세트는 햄버거와 음료의 합에서 50원을 뺀 가격
        //가장 싼 세트 메뉴의 가격 출력

        int [] burgers = new int[3];
        for(int i = 0 ; i < burgers.length; i++){
            burgers[i] = sc.nextInt();
        }

        int [] drinks = new int[2];
        for(int i = 0 ; i < drinks.length; i++){
            drinks[i] = sc.nextInt();
        }

        int minSetPrice = Integer.MAX_VALUE;
        int k = 0;
        for(int i = 0 ; i < 3; i++){
            for(int j = 0 ; j < 2 ; j++){
                int setPrice = burgers[i] + drinks[j] - 50;
                if(setPrice < minSetPrice){
                    minSetPrice = setPrice;
                }
            }
        }
          System.out.println(minSetPrice);
       }
}