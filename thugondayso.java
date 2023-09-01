import java.util.*;
import java.lang.Math;
import java.math.BigInteger;
public class thugondayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0;i < n; i++) a[i] = sc.nextInt();
        Stack<Integer> st = new Stack<Integer>();
        st.push(a[0]);
        int idx = 1;
        while(idx < n){
            while(!st.empty()&& idx < n && (st.peek() + a[idx]) % 2 == 0 ){
                st.pop();
                idx++;
            }
            if(idx < n)
                st.push(a[idx]);
            idx++;
        }
        System.out.println(st.size());

    }    

}