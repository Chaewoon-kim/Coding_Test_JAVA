import java.io.*;

class Main{
    
    public static void main(String []args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int length = Integer.parseInt(br.readLine());
        int r = 31;
        int m = 1234567891;
        
        long sum = 0;
        long mod = 1;
        char [] ch = br.readLine().toCharArray();
        for(int i = 0; i < length ; i++){
            sum += (((ch[i] - 'a') + 1 )) * mod;
            mod = (r * mod) % m;
        }
        System.out.println(sum % m);
    }
}