import java.util.*;
import java.lang.Math;
import java.lang.Character;
import java.math.BigInteger;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class danhdauchucai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> st = new HashSet<>();
        for(char c : s.toCharArray()){
            st.add(c);
        }
        System.out.println(st.size());
    }
}
