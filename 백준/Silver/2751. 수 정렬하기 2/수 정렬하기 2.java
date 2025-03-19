import java.util.*;

class Main{
    
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i < N ; i++){
            list.add(sc.nextInt());
        }
        
        Collections.sort(list);
        
        for(Integer value : list){
            sb.append(value).append('\n');
        }
        
        System.out.println(sb);
    }
}