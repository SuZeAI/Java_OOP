import java.util.Scanner;
import java.lang.Math;
public class kiemtrasofibon {
    static boolean check(long n){
        if(n == 0 || n == 1) return true;
        long fn = 1, f0 = 0, f1 = 1;
        while(fn < n){
            fn = f1 + f0;
            f0 = f1;
            f1 = fn;
        }
        if(fn == n) return true;
        return false;
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            if(check(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
