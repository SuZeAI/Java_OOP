import java.util.*;
import java.lang.Math;
import java.math.BigInteger;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class tapturienghaixau {
    static void DevideString(String s, Vector<String> a) {
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
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            Vector<String> v1 = new Vector<>();
            Vector<String> v2 = new Vector<>();
            Vector<String> v = new Vector<>();
            DevideString(s1, v1);
            DevideString(s2, v2);
            Map<String, Integer> m = new HashMap<>();
            for (int i = 0; i < v2.size(); i++)
                m.put(v2.get(i), 1);
            for (int i = 0; i < v1.size(); i++) {
                if (m.get(v1.get(i)) == null) {
                    v.add(v1.get(i));
                    m.put(v1.get(i), 1);
                }
            }
            Collections.sort(v);
            for (int i = 0; i < v.size(); i++)
                System.out.print(v.get(i) + " ");
            System.out.println();
        }
    }
}
