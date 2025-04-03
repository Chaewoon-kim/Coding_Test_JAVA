import java.util.Scanner;
class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //성의 가로 크기 (행)
        int M = sc.nextInt(); //성의 세로 크기 (열)
        sc.nextLine();

        boolean[] rowGuard = new boolean[N];
        boolean[] colGuard = new boolean[M];

        //O(NM)
        for (int i = 0; i < N; i++) {
            String row = sc.nextLine();
            for (int j = 0; j < M; j++) {
                if (row.charAt(j) == 'X'){
                    rowGuard[i] = true;
                    colGuard[j] = true;
                }
            }
        }

        //경비원이 없는 행 개수 카운트
        int needRowCount = 0;
        for (boolean row : rowGuard) {
            if (!row){
                needRowCount++;
            }
        }

        //열 개수 카운트
        int needColCount = 0;
        for (boolean col : colGuard) {
            if (!col){
                needColCount++;
            }
        }


        System.out.println(Math.max(needRowCount,needColCount));
    }
}
