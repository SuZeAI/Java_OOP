import java.util.*;
import java.lang.Math;
import java.math.BigInteger;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class hieuhaisolon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            String s = a.subtract(b).abs().toString();
            System.out.println(a.compareTo(b) >= 0 ? s : ("-" + s));    
    }
}
