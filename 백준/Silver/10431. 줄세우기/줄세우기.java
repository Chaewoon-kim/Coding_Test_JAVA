

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt(); //테스트 케이스 수

        while (P-- > 0) {
            int T = sc.nextInt(); //테스트 케이스 번호
            int[] heights = new int[20]; //학생들의 키 배열
            for (int i = 0; i < 20; i++) {
                heights[i] = sc.nextInt();
            }

            int totalMove = 0; //총 이동 횟수

            //삽입정렬 방식으로 이동 횟수 계산
            for (int i = 1; i < 20 ; i++) {
                int key = heights[i];
                int j = i - 1;

                //왼쪽 값이 key보다 더 크다면 한 칸씩 뒤로
                while (j >= 0 && heights[j] > key){
                    heights[j + 1] = heights[j];
                    j--;
                    totalMove++;
                }
                heights[j + 1] = key;
            }
            System.out.println(T + " " + totalMove);
        }

    }
}

