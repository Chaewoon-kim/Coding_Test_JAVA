import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //성의 가로 크기 (행)
        int M = sc.nextInt(); //성의 세로 크기 (열)
        sc.nextLine();

        List<String> castle = new ArrayList<>();

        int rowCount = 0;
        int colCount = 0;

        for (int i = 0; i < N; i++) {
            castle.add(sc.nextLine()); //성의 상태
        }

        //행에서 경비원 여부
        for (String s : castle) {
            if (s.contains("X")){
                rowCount++;
            }
        }

        //열에서 경비원 여부
        for (int i = 0; i < M; i++) {
            boolean exist = false;
            for (String s : castle) {
                if (s.charAt(i) == 'X'){
                    exist = true;
                    break;
                }
            }
            if (exist){
                colCount++;
            }
        }


        int needRowCount = N - rowCount; //5-2 = 3
        int needColCount = M - colCount; //8-6 = 2

        System.out.println(Math.max(needRowCount,needColCount));

    }
}
