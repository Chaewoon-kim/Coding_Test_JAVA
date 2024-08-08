import java.util.Scanner;
import java.util.HashSet;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [] numArray = new int[10];
        HashSet<Integer> remainders = new HashSet<>();
        
        for(int i = 0 ; i < numArray.length ; i++){
            numArray[i] = sc.nextInt();
        }
        for(int i = 0; i < numArray.length ; i++){
            remainders.add(numArray[i] % 42);
        }
        System.out.println(remainders.size());
    }
}