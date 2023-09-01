import java.util.*;
import java.lang.Math;
import java.math.BigInteger;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class bosungdayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mn = 205;
        int mx = 0, tmp;
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            tmp = sc.nextInt();
            if (tmp > mx)
                mx = tmp;
            if (tmp < mn)
                mn = tmp;
            st.add(tmp);
        }
        boolean check = true;
        for (int i = 1; i <= mx; i++) {
            if (!st.contains(i)) {
                st.add(i);
                check = false;
                System.out.println(i);
            }
        }
        if(check) System.out.println("Excellent!");
    }
}
