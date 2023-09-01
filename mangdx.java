import java.util.Scanner;
import java.util.*;
import java.lang.Math;
import java.math.BigInteger;

public class mangdx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n  = sc.nextInt();
            int [] a = new int[n];
            for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
            int l = 0, r = n - 1;
            boolean check = true;
            while(l <= r){
                if(a[l] != a[r]){
                    check = false;
                    break;
                }
                l++; r--;
            }
            System.out.println((check? "YES" : "NO"));
        }
    }
}
