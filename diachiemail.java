import java.util.*;
import java.lang.Math;
import java.math.BigInteger;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class diachiemail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> m = new HashMap<String, Integer>();
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
            s = a.get(a.size() - 1);
            for (int i = 0; i < a.size() - 1; i++)
                s += a.get(i).substring(0, 1);
            if (m.get(s) == null) {
                m.put(s, 1);
                x = "";
            } else {
                x = Integer.toString(m.get(s) + 1);
                m.put(s, m.get(s) + 1);
            }
            System.out.println(s + x + "@ptit.edu.vn");
        }
    }    
}
