import java.util.*;
import java.lang.Math;
import java.math.BigInteger;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class chuanhoahoten2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            Vector<String> a = new Vector<>();
            String x = "";
            s = s.toLowerCase() + " ";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    if (x != "") {
                        a.add(x);
                        x = "";
                    }
                } else {
                    x += s.charAt(i);
                }
            }
            System.out.print(a.get(1).substring(0,1).toUpperCase() + a.get(1).substring(1));
            for (int i = 2; i < a.size(); i++) {
                String k = a.get(i);
                System.out.print(" " + k.substring(0, 1).toUpperCase() + k.substring(1));
            }
            System.out.printf(", %s", a.get(0).toUpperCase());
            System.out.println();
        }
    }
}
