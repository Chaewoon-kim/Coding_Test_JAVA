import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int [] positions = new int[26];
        for(int i = 0 ; i < 26 ; i ++){
            positions[i] = 0;
        }
        for(int i = 0 ; i < str.length(); i++){
            char c = str.toLowerCase().charAt(i);
            int index = c - 'a';
            
            if(positions[index] == 0){
                positions[index] = 1;
            }else{
                positions[index]++;
            }
        }
        for(int i = 0 ; i < 26 ; i++){
            System.out.print(positions[i] + " ");
        }
    }
}