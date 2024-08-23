import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxCount =  100;
        int lineCount = 0;
        while(lineCount < maxCount) {
            if(!sc.hasNextLine()){
                break;
            }
            String s = sc.nextLine();
            
            System.out.println(s);
            lineCount ++;
        }

    }
}
