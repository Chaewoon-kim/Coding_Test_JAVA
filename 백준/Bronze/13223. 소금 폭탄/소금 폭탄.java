import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] currentTime = sc.next().split(":");
        int currentHour = Integer.parseInt(currentTime[0]);
        int currentMin = Integer.parseInt(currentTime[1]);
        int currentSec = Integer.parseInt(currentTime[2]);

        int currentSecondAmount = currentHour * 3600 + currentMin * 60 + currentSec;

        String[] dropTime = sc.next().split(":");
        int dropHour = Integer.parseInt(dropTime[0]);
        int dropMin = Integer.parseInt(dropTime[1]);
        int dropSec = Integer.parseInt(dropTime[2]);

        int dropSecondAmount = dropHour * 3600 + dropMin * 60 + dropSec;
        int needSecAmount = dropSecondAmount - currentSecondAmount;
        if(needSecAmount <= 0){
            needSecAmount += 24 * 3600;
        }

        int needHour = needSecAmount / 3600; //시
        int needMin = (needSecAmount % 3600) / 60; //분
        int needSec = needSecAmount % 60; //초

        System.out.printf("%02d:%02d:%02d" , needHour , needMin , needSec);


    }
}
