import java.util.*;
import java.lang.Math;
import java.math.BigInteger;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class sodep1 {
    public static Boolean Check(String s) {
        String x = "";
        for (int i = 0; i < s.length(); i++) {
            if ((int) s.charAt(i) % 2 == 1)
                return false;
            x = s.charAt(i) + x;
        }
        if (x.compareTo(s) == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if (Check(s) == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
