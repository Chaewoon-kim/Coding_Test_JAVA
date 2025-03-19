import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        int[] numbers = new int[number.length()];

        //각 자릿수를 잘라서 Integer 배열에 삽입
        for (int i = 0; i < number.length(); i++) {
            numbers[i] = Integer.parseInt(number.substring(i, i + 1));
        }

        //선택정렬 구현
        for (int i = 0; i < numbers.length; i++) {
            int max = i; //최댓값 설정
            for (int j = i + 1; j < numbers.length; j++) {
                //다음 인덱스부터 비교하면서 최댓값 찾기
                if(numbers[j] > numbers[max]){
                    max = j;
                }
            }
            //내림차순 정렬
            if(numbers[i] < numbers[max]){
                int temp = numbers[i];
                numbers[i] = numbers[max];
                numbers[max] = temp;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
    }
}
