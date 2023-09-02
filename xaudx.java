import java.util.*;
import java.lang.Math;
import java.math.BigInteger;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class xaudx {
    public static int check(String s) {
        int k = 0, n = s.length();
        for (int i = 0; i <= (n - 1) / 2; i++)
            if (s.charAt(i) != s.charAt(n - i - 1))
                k++;
        if ((n % 2 == 0 && k == 1) || (n % 2 == 1 && k <= 1))
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = check(s);
            if (k == 0)
                System.out.println("NO");
            else if (k == 1)
                System.out.println("YES");
        }
        sc.close();
    }    
}
