import java.util.*;
import java.lang.Math;
import java.math.BigInteger;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class hieusonguyenlon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            int m = Math.max(a.toString().length(), b.toString().length());
            String s = a.subtract(b).abs().toString();
            while(s.length() != m){
                s = "0" + s;
            }
            System.out.println(s);
        }
        sc.close();        
    }
}
