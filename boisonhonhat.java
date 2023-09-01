import java.util.*;
import java.lang.Math;
import java.math.BigInteger;
public class boisonhonhat {
    static long GCD(long a, long b){
        BigInteger e = BigInteger.valueOf(a);
        BigInteger f = BigInteger.valueOf(b);
        BigInteger c = e.gcd(f);
        return c.longValue();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Long n = sc.nextLong();
            Long s = 1L;
            for (Long i = 1L; i <= n; i++) {
                s = i * s / GCD(i, s);
            }
            System.out.println(s);
        }
    }
}
