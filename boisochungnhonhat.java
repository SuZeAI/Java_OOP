import java.util.Scanner;
import java.lang.Math;
import java.math.BigInteger;
public class boisochungnhonhat {
    static BigInteger gcd(BigInteger m, BigInteger n){
        BigInteger g = m.gcd(n);
        BigInteger h = m.multiply(n);
        BigInteger j = h.divide(g);
        return j;
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger m = sc.nextBigInteger();
            BigInteger n = sc.nextBigInteger();
            System.out.println(gcd(n, m));
        }
    }
}
