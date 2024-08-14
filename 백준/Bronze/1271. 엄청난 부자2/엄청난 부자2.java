import java.util.Scanner;
import java.math.BigInteger;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        BigInteger n = new BigInteger(sc.next());
        BigInteger m = new BigInteger(sc.next());
        
        BigInteger result = n.divide(m);
        BigInteger remainder = n.remainder(m);
        
        System.out.println(result);
        System.out.println(remainder);
    }
}