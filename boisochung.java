import java.util.Scanner;
import java.lang.Math;
public class boisochung {
    static long gcd(long a, long b){
        while(a != 0){
            long x = a;
            a = b % a;
            b = x;
        }
        return b;
    }
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while(i-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long m = a * b;
            long g = gcd(a, b);
            System.out.println(m/g + " " + g);
        }
    }
}
