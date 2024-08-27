import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [] off = new int[4];
        int [] on = new int[4];
        
        for(int i = 0 ; i < 4 ; i++){
            off[i] = sc.nextInt();
            on[i] = sc.nextInt();
        }
        
        int currentPassengers = 0;
        int maxPassengers = 0;
        
        for(int i = 0 ; i < 4 ; i++){
            currentPassengers = currentPassengers - off[i] + on[i];
            if(currentPassengers > maxPassengers){
                maxPassengers = currentPassengers;
            }
        }
        System.out.println(maxPassengers);
    }
}