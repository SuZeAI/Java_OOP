import java.util.*;
import java.lang.Math;
import java.lang.Character;
import java.math.BigInteger;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class rutgonxaukitu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<Character>();
        st.push(s.charAt(0));
        int n = s.length();
        int i = 1;
        while(i < n){
            char c = ' ';
            if(!st.empty())
                c = st.peek();
            if(st.empty()){
                st.push(s.charAt(i));
            }
            else if(c == s.charAt(i)){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
            i++;
        }
        if(st.empty())
        {
            System.out.println("Empty String");
        }
        else{

            String ans = "";
            while(!st.empty()){
                ans = st.peek() + ans;
                st.pop(); 
            }
            System.out.println(ans);
        }
    }
}