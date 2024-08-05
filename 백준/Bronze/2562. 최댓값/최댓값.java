import java.util.Scanner; 

class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[9];
        
        for(int i = 0 ; i < 9 ; i++){
            numbers[i] = sc.nextInt();
        }
        
        int maxValue = numbers[0];
        int maxIndex = 0;
        
        for(int i = 0 ; i < numbers.length ; i++){
            if(numbers[i] > maxValue ){
                maxValue = numbers[i];
                maxIndex = i;
            }
        }
        System.out.println(maxValue);
        System.out.println(maxIndex + 1);
    }
}