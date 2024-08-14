import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(true){
            String str = sc.nextLine();
            if(str.contains("#")){
                break;
            }
            for(int i = 0 ; i < str.length(); i++){
                char c = Character.toLowerCase(str.charAt(i));
                if(c == 'a' || c == 'e' || c == 'i' || c =='o' || c == 'u'){
                   count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
    }
}