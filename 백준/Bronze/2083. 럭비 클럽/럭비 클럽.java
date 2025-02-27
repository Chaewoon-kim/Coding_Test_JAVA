import java.util.Scanner;

class Main{
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        while(true){
            String name = sc.next();
            int age = sc.nextInt();
            int weight = sc.nextInt();
            
            //루프 종료 조건
            if(name.equals("#") && age == 0 && weight == 0){
                break;
            }
            
            if(age > 17 || weight >= 80){
                System.out.println(name + " Senior");
            }else{
                System.out.println(name + " Junior");
            }
        }
    }
}