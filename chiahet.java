import java.util.*;
import java.util.function.BinaryOperator;
import java.lang.Math;
import java.lang.Character;
import java.math.BigInteger;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class chiahet {
    static boolean check(BigInteger a, BigInteger  b){
        return a.mod(b).compareTo(BigInteger.valueOf(0)) == 0 || b.mod(a).compareTo(BigInteger.valueOf(0)) == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println((check(a, b) ? "YES" : "NO"));
        }
    }
}
