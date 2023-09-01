import java.util.Scanner;
import java.lang.Math;
public class sochinhphuong {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int sq = (int)Math.sqrt(n);
            if (sq * sq == n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
